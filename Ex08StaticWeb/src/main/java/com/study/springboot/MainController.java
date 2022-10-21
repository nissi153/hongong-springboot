package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//URI : http://localhost:8090/
	@GetMapping("/")
	//@ReponseBody를 넣으면 안됨(문자열로 응답함.)
	public String root() {
		//웹페이지로 응답
		return "index.html";
	}
}
