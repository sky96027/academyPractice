package kr.green.spring.service;
 
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;
 
@Service
public class MemberServiceImp implements MemberService {
    @Autowired
    MemberDAO memberDao;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    @Autowired
    JavaMailSender mailSender;

	@Override
	public boolean signup(MemberVO user) {
		if(user == null)
			return false;
		if(user.getMe_id() == null ||user.getMe_id().trim().length() == 0)
			return false;
		String encPw= passwordEncoder.encode(user.getMe_pw());
		user.setMe_pw(encPw);
		memberDao.insertMember(user);
		return true;
	}

	@Override
	public MemberVO login(MemberVO user) {
		if(user == null || user.getMe_id() == null
			|| user.getMe_id().trim().length() == 0)
			return null;
		MemberVO dbUser = memberDao.selectMember(user.getMe_id());
		//로그인에 성공하면 회원정보를 실패하면 null을 반환
		if(dbUser == null)
			return null;
		//matches(원래 비번, 암호화된 비번) : 같으면(비번이 맞으면) true 다르면 false
		if(!passwordEncoder.matches(user.getMe_pw(), dbUser.getMe_pw()))
			return null;
		return dbUser;
	}

	@Override
	public String idCheck(String me_id) {
		MemberVO user = memberDao.selectMember(me_id);
		if(user == null)
			return "true";
		else
			return "false";
	}

	@Override
	public MemberVO updateMember(MemberVO inputUser, MemberVO user) {
		if(inputUser == null || user == null ||
				inputUser.getMe_id() == null || inputUser.getMe_id().length() == 0)
		return null;
		//아이디 덮어쓰기
		inputUser.setMe_id(user.getMe_id());
		//권한 덮어쓰기
		inputUser.setMe_authority(user.getMe_authority());
		//비밀번호
		if(inputUser.getMe_pw() == null || inputUser.getMe_pw().length()==0) {
			inputUser.setMe_pw(user.getMe_pw());
		}else {
			String encPw = passwordEncoder.encode(inputUser.getMe_pw());
			inputUser.setMe_pw(encPw);
		}
		//주소
		if(inputUser.getMe_address() == null || inputUser.getMe_address().length() == 0) {
			inputUser.setMe_address(user.getMe_address());
		}
		memberDao.updateMember(inputUser);
		
		return inputUser;
	}

	@Override
	public String selectMemberByEmail(MemberVO member) {
		if(member == null)
			return "";
		return memberDao.selectIdByEmail(member);
	}

	@Override
	public String sendPassword(MemberVO member) {
		if(member == null)
			return "fail";
		//회원 정보를 가져옴 (id를 이용)
		MemberVO user = memberDao.selectMember(member.getMe_id());
		//가져온 회원 정보의 이메일과 입력한 이메일을 비교하여 같은지 확인
		if(user == null | !user.getMe_email().equals(member.getMe_email()))
			return "fail";
		//새 비번 생성
		String newPw = createRandomPw(6);
		//새 비번 암호화
		String encPw = passwordEncoder.encode(newPw);
		//새 비번 DB에 저장
		user.setMe_pw(encPw);
		memberDao.updateMember(user);
		//새 비번 이메일 전송
		String contents = "새 비밀번호는 " + newPw + "입니다";
		String from = "sjy96@gmail.com";
		String title = "새 비밀번호가 발급되었습니다.";
		if(!sendEmail(from, user.getMe_email(), title, contents))
			return "error";
		return "ok";
	}
	
	private String createRandomPw(int maxSize) {
		String newPw = "";
		if(maxSize <= 0)
			return "";
		for(int i = 1; i <= maxSize; i++) {
			int r = (int)(Math.random()*62);
			if(r<10) {
				newPw +=(char)('0'+r);
			}else if(r < 36) {
				newPw +=(char)('a'+r-10);
			}else {
				newPw +=(char)('A'+r-36);
			}
		}
		return newPw;
	}
    private boolean sendEmail(String from, String to, String title, String contents) {
    	try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper 
                = new MimeMessageHelper(message, true, "UTF-8");

            messageHelper.setFrom(from);  // 보내는사람 생략하거나 하면 정상작동을 안함
            messageHelper.setTo(to);     // 받는사람 이메일
            messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
            messageHelper.setText(contents);  // 메일 내용

            mailSender.send(message);
        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    	return true;
    
    }
}