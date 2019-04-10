package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Controller
public class BoardInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(BoardInterceptor.class);

	@Override 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info(" + + + 인터셉터 시작 + + +");
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			logger.info(">> 접속불가! 회원이 아닙니다");
			response.sendRedirect("/board/noLogin");
			return false; // 컨트롤러 접근차단!
		}
		
		logger.info(">> 접속 가능!");
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
