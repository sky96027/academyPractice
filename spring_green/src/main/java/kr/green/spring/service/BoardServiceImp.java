package kr.green.spring.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.utils.UploadFileUtils;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.FileVO;
import kr.green.spring.vo.LikesVO;
import kr.green.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService {
	
	@Autowired
	BoardDAO boardDao;
	
	String uploadPath = "D:\\java_kyg\\upload";
	//String uploadPath = "D:\\java_kyg\\upload";

	@Override
	public List<BoardVO> getBoardList(Criteria cri) {
		return boardDao.selectBoardList(cri);
	}

	@Override
	public BoardVO getBoard(Integer bd_num) {
		if(bd_num == null || bd_num <= 0)
			return null;
		
		return boardDao.selectBoard(bd_num);
	}

	@Override
	public void registerBoard(BoardVO board, MemberVO user , List<MultipartFile> files) {
		if(board == null || user == null)
			return;
		if(board.getBd_title() == null 
				|| board.getBd_title().trim().length() == 0)
			return;
		if(user.getMe_id()== null || user.getMe_id().trim().length()==0)
			return;
		if(board.isAccessAuthority(user.getMe_authority()))
			return;
		board.setBd_me_id(user.getMe_id());
		boardDao.insertBoard(board);
		
		uploadFile(files, board.getBd_num());
	}

	@Override
	public void modifyBoard(BoardVO board, MemberVO user , 
			List<MultipartFile> files2, Integer[] fileNums) {
		if(board == null || user == null || board.getBd_num() <= 0 )
			return;
		
		BoardVO dbBoard = boardDao.selectBoard(board.getBd_num());
		
		if(dbBoard == null)
			return;
		
		if(!dbBoard.getBd_me_id().equals(user.getMe_id()))
			return;
		
		boardDao.updateBoard(board);
		
		//첨부파일을 삭제(수정화면에서 x버튼 눌러서 취소환 첨부파일들)
		//게시글의 첨부파일들을 가져옴
		List<FileVO> fileList = boardDao.selectFileList(board.getBd_num());
		List<FileVO> remainFileList = new ArrayList<FileVO>();
		//가져온 첨부파일들 중에서 fileNums에 일치하는 번호가 있으면 remailFileList에 추가
		//유지해야할 첨부파일이 있는 경우
		if(fileNums != null && fileNums.length != 0) {
			for(FileVO tmp : fileList) {
				for(Integer tmpNum : fileNums) {
					if(tmp.getFi_num() == tmpNum) {
						remainFileList.add(tmp);
					}
				}
			}
			//게시글의 전체 첨부파일중 유지해야할 첨부파일을 제외한 첨부파일 만듬
			fileList.removeAll(remainFileList);
		}
		//실제 서버에서 삭제 후 DB에서 삭제처리
		deleteFile(fileList);
		
		//새로 추가한 첨부파일을 업로드
		uploadFile(files2, board.getBd_num());
	}

	@Override
	public void deleteBoard(Integer bd_num, MemberVO user) {
		if(bd_num == null || bd_num <= 0)
			return;
		BoardVO board = boardDao.selectBoard(bd_num);
		if(board == null)
			return;
		if(user != null && board.getBd_me_id().equals(user.getMe_id()))
			boardDao.deleteBoard(bd_num);
		List<FileVO> fileList=boardDao.selectFileList(bd_num);
		deleteFile(fileList);
	}

	@Override
	public List<FileVO> getFileList(Integer bd_num) {
		if(bd_num == null || bd_num <= 0)
			return null;
		return boardDao.selectFileList(bd_num);
	}
	
	private void uploadFile(List<MultipartFile> files, int bd_num) {
		if(files == null || files.size() == 0)
			return;
		for(MultipartFile tmpFile : files) {
			if(tmpFile != null && tmpFile.getOriginalFilename().length() != 0) {
				try {
					String path = 
						UploadFileUtils.uploadFile(
							uploadPath, 
							tmpFile.getOriginalFilename(), 
							tmpFile.getBytes());
					FileVO file 
						= new FileVO(tmpFile.getOriginalFilename(),path,bd_num);
					boardDao.insertFile(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	private void deleteFile(List<FileVO> fileList) {
		
		if(fileList != null && fileList.size()!= 0) {
			for(FileVO tmp : fileList) {
				String fileName = tmp.getFi_name().replace("/",File.separator);
				File file = new File(uploadPath + fileName);
				boardDao.deleteFile(tmp);
				if(file.exists()) {
					file.delete();
				}
			}
		}
	}

	@Override
	public int getTotalCount(Criteria cri) {
		return boardDao.selectBoardCount(cri);
	}

	@Override
	public void updateView(Integer bd_num) {
		if(bd_num == null || bd_num <=0)
			return;
		boardDao.updateViews(bd_num);
		
	}

	@Override
	public String likes(LikesVO likes, MemberVO user) {
		if(likes == null || user == null)
			return "fail";
		//DB에서 해당 유저가 해당 게시글을 추천/비추천했는지 확인하기 위해 DB에서 가져옴
		LikesVO dbLikes = boardDao.selectLikes(likes);
		System.out.println(dbLikes);
		//해당 게시글에 추천/비추천을 한적이 없을 때
		if(dbLikes == null) {
			boardDao.insertLikes(likes);
			//해당 게시글에 추천,비추천 수를 계산
			boardDao.updateBoardLikes(likes);
			return ""+likes.getLi_state();
		}
		//취소하는 경우
		if(dbLikes.getLi_state() == likes.getLi_state()) {
			likes.setLi_state(0);
			boardDao.updateLikes(likes);
			boardDao.updateBoardLikes(likes);
			return "0";
		}
		//추천 =>비추천 또는 비추천 =>추천으로 바뀌는 경우
		boardDao.updateLikes(likes);
		boardDao.updateBoardLikes(likes);
		return ""+likes.getLi_state();
	}
	@Override
	public String viewLikes(LikesVO likes, MemberVO user) {
		if(likes == null || user == null) {
			return "0";
		}
		LikesVO dbLikes = boardDao.selectLikes(likes);
		if(dbLikes == null)
			return "0";
		return ""+dbLikes.getLi_state();
	}

}