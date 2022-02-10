package kr.green.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.FileVO;
import kr.green.spring.vo.LikesVO;

public interface BoardDAO {

	List<BoardVO> selectBoardList(@Param("cri")Criteria cri);

	BoardVO selectBoard(@Param("bd_num")Integer bd_num);

	void insertBoard(@Param("board")BoardVO board);

	void updateBoard(@Param("board")BoardVO board);

	void deleteBoard(@Param("bd_num")Integer bd_num);

	void insertFile(@Param("file")FileVO file);

	List<FileVO> selectFileList(@Param("bd_num")Integer bd_num);

	void deleteFile(@Param("file")FileVO tmp);

	int selectBoardCount(@Param("cri")Criteria cri);

	void updateViews(@Param("bd_num")Integer bd_num);

	LikesVO selectLikes(@Param("likes")LikesVO likes);

	void insertLikes(@Param("likes")LikesVO likes);

	void updateBoardLikes(@Param("likes")LikesVO likes);

	void updateLikes(@Param("likes")LikesVO likes);

}