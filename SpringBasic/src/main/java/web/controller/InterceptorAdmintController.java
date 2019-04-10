package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InterceptorAdmintController {
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorAdmintController.class);
	
	@RequestMapping(value = "/interceptor/admin/main", method=RequestMethod.GET)
	public void adminMain(Model model) {
		logger.info("관리자페이지 폼 활성화");
	}
	
	@RequestMapping(value = "/interceptor/admin/adminFail")
	public void adminFail(Model model) {
		logger.info("관리자페이지 페이지 접속실패");
		
	}
}

