package kr.green.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService {
	
	@Autowired
	BoardDAO boardDao;

	@Override
	public void registerBoard(BoardVO board) {
		if(board == null 
			|| board.getBd_title() == null
			|| board.getBd_contents() == null
			|| board.getBd_me_id() ==null)
			return;
		boardDao.insertBoard(board);
	}

	@Override
	public List<BoardVO> getBoardList(String type) {
		return boardDao.getBoardList(type);
	}

	@Override
	public BoardVO getBoard(Integer bd_num) {
		// 게시글 번호가 없거나 0 이하이면 null을 반환
		if(bd_num == null || bd_num <= 0)
			return null;
		//dao에게 일을 시킴
		BoardVO board = boardDao.getBoard(bd_num);
		return board;
	}

	@Override
	public void deleteBoard(Integer bd_num, MemberVO user) {
		//유효하지 않은 게시글 번호이면 삭제할 필요 없음
		//번호가 null이거나 음수, 0인경우
		if(bd_num == null || bd_num <= 0)
			return;
		//게시글 번호와 일치하는 게시글을 가져옴
		BoardVO board = boardDao.getBoard(bd_num);
		//가져온 게시글이 null이면 삭제할 필요가 없음
		if(board == null)
			return;
		//게시글 작성자와 로그인한 회원 아이디가 같은지 확인하여 다르면 삭제할 필요 없음
		//board.getBd_me_id()와 user.getMe_id()가 다르면
		if(!board.getBd_me_id().equals(user.getMe_id()))
			return;
		
		//게시글을 삭제
		//게시글의 bd_del을 Y로 수정
		//dao에게 수정된 게시글을 업데이트 하라고 시킴
		
		//boardDao.게시글삭제(게시글 번호);
		//1. 재사용성 낮음, 쿼리문 단순
		boardDao.deleteBoard(bd_num);
		//2. 재사용성 높음, 쿼리문 복잡
		/*
		board.setBd_del("Y");
		board.setBd_del_date(new date());
		boardDao.updateBoard(board);
		*/
	}

	@Override
	public void modifyBoard(Integer bd_num, MemberVO user, BoardVO boardmodify) {
		if(bd_num == null || bd_num <= 0)
			return;
		BoardVO board = boardDao.getBoard(bd_num);
		if(board == null)
			return;
		if(!board.getBd_me_id().equals(user.getMe_id()))
			return;
		boardDao.modifyBoard(bd_num);
		
		
	}
}