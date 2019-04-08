package com.spring.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HiController{
	
	/* GET메소드를 처리하는 컨트롤러 */
	@RequestMapping(value="/test/hi", method=RequestMethod.GET)
	public String hi(int num) {
		/* view 네임  return */
		return "test/hi";
	}
	
	@RequestMapping(value="/test/hello", method=RequestMethod.GET)
	public void hello() {
		/* view 네임  지정하지 않으면  @RequestMapping(value="의 경로를 view지정함") */
	}
}
