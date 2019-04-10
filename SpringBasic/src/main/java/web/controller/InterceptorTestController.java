package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.User;

@Controller
public class InterceptorTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorTestController.class);
	
	@RequestMapping(value = "/interceptor/main", method=RequestMethod.GET)
	public void main(Model model) {
		logger.info("메인페이지 폼 활성화");
	}
	@RequestMapping(value = "/interceptor/login", method=RequestMethod.GET)
	public void login(Model model) {
		logger.info("로그인 폼 활성화");
	}
	
	@RequestMapping(value = "/interceptor/login", method=RequestMethod.POST)
	public String loginComplete(Model model, HttpSession session, User user) {
		logger.info(user.toString());
		
		if ("abc".equals(user.getId())) {
			logger.info("일반회원 로그인성공");
			session.setAttribute("login", true);
			session.setAttribute("nick", "수정");
			
		} else if ("admin".equals(user.getId())) {
			logger.info("관리자 로그인성공");
			session.setAttribute("login", true);
			session.setAttribute("nick", "관리자");
			
		} else {
			logger.info("로그인실패");
			return "redirect:/interceptor/login";
			
		}
		return "redirect:/interceptor/main";
	}
	
	@RequestMapping(value = "/interceptor/logout", method=RequestMethod.GET)
	public String logout(Model model, HttpSession session) {
		session.invalidate();
		return "redirect:/interceptor/main";
	}
}
