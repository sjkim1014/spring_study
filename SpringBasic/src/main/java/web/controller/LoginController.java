package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Login;
import web.service.face.JoinService;
import web.service.face.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@Autowired
	JoinService joinService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/login/main", method=RequestMethod.GET)
	public void mainForm(Model model) { 
		
	}
	
	 @RequestMapping(value = "/login/main", method=RequestMethod.POST)
	 public String loginForm(String id, String pw, Model model, HttpSession session) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		int isUser = loginService.login(model);
		 
		String redirect = null;
		 
		if(isUser == 1) {
			// 회원인경우
			// 세션등록
			session.setAttribute("login", true);
			redirect = "login/main";
		}
		else {
			logger.info("로그인 정보 error");
			// 비회원인경우
			redirect = "redirect:/login/alert";
		}
		return redirect;
	 }
	
	@RequestMapping(value = "/login/join", method=RequestMethod.GET)
	public void join(Model model) { 
		logger.info("joinForm");
	}
	
	@RequestMapping(value = "/login/join", method=RequestMethod.POST)
	public String joinProc(Login userInfo, Model model) {
		System.out.println(userInfo);
		joinService.memberJoin(userInfo);
		return "redirect:/login/main";
	}
	
	@RequestMapping(value="/login/alert", method=RequestMethod.GET)
	public void loginErrorAlert(Model model) {
		model.addAttribute("msg", "아이디 혹은 비밀번호를 재확인해주세요"); 
		model.addAttribute("url", "/login/main");
	}
}

