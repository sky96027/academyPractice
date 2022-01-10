package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MemberInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		//Object user = request.getSession().getAttribute("user"); 아래 코드 두 줄과 같음
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		//세션에 회원정보가 없으면 => 로그인을 안했으면
		if(user == null) {
			response.sendRedirect(request.getContextPath()+"/login");
			//가던 url로 가지말고 위에 있는 url로 이동
			return false;
		}
		return true;
	}
}
