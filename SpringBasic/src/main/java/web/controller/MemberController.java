package web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Member;
import web.service.face.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/member/insert", method=RequestMethod.GET)
	public void insertForm(Model model) {
		
	}
	
	@RequestMapping(value = "/member/insert", method=RequestMethod.POST)
	public String insert(Member member, Model model) {
		logger.info("insert_member");
		memberService.insert(member);
		return "redirect:/member/memberList";
	}
	@RequestMapping(value = "/member/memberList", method=RequestMethod.GET)
	public void list(Model model) {
		List<Member> res = memberService.getMember();
		// System.out.println("member res :  " + res);
		model.addAttribute("member", res);
	
	}
}
