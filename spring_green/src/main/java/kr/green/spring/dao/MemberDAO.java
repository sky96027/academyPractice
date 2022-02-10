package kr.green.spring.dao;
 
import org.apache.ibatis.annotations.Param;

import kr.green.spring.vo.MemberVO;
 
public interface MemberDAO {

	void insertMember(@Param("user")MemberVO user);

	MemberVO selectMember(@Param("me_id")String me_id);

	void updateMember(@Param("user")MemberVO inputUser);

	String selectIdByEmail(@Param("user")MemberVO member);
}