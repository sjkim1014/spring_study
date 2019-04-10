package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorAdmintController.class);

	@RequestMapping(value = "/board/list", method=RequestMethod.GET)
	public void boardList(Model model) {
		logger.info("게시판 목록 폼 활성화");
	}
	
	@RequestMapping(value = "/board/write", method=RequestMethod.GET)
	public void boardWrite(Model model, HttpSession session) {
		logger.info("게시판 작성 폼 활성화");
	}
	
	@RequestMapping(value = "/board/noLogin", method=RequestMethod.GET)
	public void noLogin(Model model, HttpSession session) {
		logger.info("비회원 작성 불가 폼 활성화");
	}
}
