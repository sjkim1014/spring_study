package web.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.dto.ResultData;

@Controller
public class AjaxController {

	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);
	
	@RequestMapping("/ajax/test01")
	public void ajaxTest() {
		
	}
	
	@RequestMapping("/ajax/test01_ok")
	public void ajaxTest_ok(Writer out) {
		logger.info("AJAX 요청 받음");
		try {
			out.write("{\"result\":\"HELLO AJAX\"}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/ajax/test02")
	public void ajaxTest02() {
		
	}
	
	// @ResponseBody
	// 응답의 내용을 직접 작성한다 
	// response 메시지의 body 부분을  return 내용으로 채운다
	
	// Jackson-Mapper 를 이용하면 json으로 marshalling 해준다
	// Jackson-Databind 라이브러리를 추가하면 된다
	
	@RequestMapping("/ajax/test02_ok")
	public @ResponseBody ResultData ajaxTest02_ok() {
		logger.info("AJAX 요청 받음");
		
		ResultData rd = new ResultData();
		rd.setData1("ABC");
		rd.setData2(123);
		
		logger.info(rd.toString());
		return rd;
		
	}
	
	
	@RequestMapping("/ajax/test03")
	public void ajaxTest03() {
		
	}
	@RequestMapping("/ajax/test03_ok")
	public String ajaxTest03_ok(Model model) {
		logger.info("AJAX 요청 받음");
		
		Map map = new HashMap();
		
		map.put("id", "userid");
		map.put("pw", "password");
		
		model.addAllAttributes(map);
		
		return "jsonView";
	}
}
