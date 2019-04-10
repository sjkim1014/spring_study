package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import web.controller.InterceptorAdmintController;

public class AdminInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorAdmintController.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info(" + + + 인터셉터 시작 + + +");
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			logger.info(">> 접속불가! 로그인되지않음");
			response.sendRedirect("/interceptor/admin/adminFail");
			return false; // 컨트롤러 접근차단!
		
		} else {
			logger.info(">> 로그인 상태");
			
			if(!"관리자".equals(session.getAttribute("nick"))) {
				logger.info(">> 접속불가! 일반사용자 로그인입니다");
				response.sendRedirect("/interceptor/admin/adminFail");
				return false; // 컨트롤러 접근차단!
			}
		}
		
		return true;
		
		// preHandle 메소드의 반환값
		// true - 컨트롤러 접근 허용
		// false - 컨트롤러 접근 차단
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info(" + + + 인터셉터 종료 + + +");
		
	}
}
