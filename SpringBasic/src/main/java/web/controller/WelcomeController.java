package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	// void :: 경우 value를  prefix, suffix 붙혀서 view 지정 => WEB-INF/views/welcoms.jsp 
	public String welcome(String name, Model model) {
		model.addAttribute("data", "모델데이터 입니다 헬로우");
		return "wel";
		// 리턴 타입이 있는경우 리턴으로 지정한 viewName 으로 이동!!
	}
}
