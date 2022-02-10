package kr.green.spring.service;

import kr.green.spring.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO user);

	MemberVO login(MemberVO user);

	String idCheck(String me_id);

	MemberVO updateMember(MemberVO inputUser, MemberVO user);

	String selectMemberByEmail(MemberVO member);

	String sendPassword(MemberVO member);
}