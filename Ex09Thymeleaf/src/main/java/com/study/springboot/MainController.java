package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		return "redirect:index1";
	}
	
	@GetMapping("/index1")
	public String index1(Model model) {
		
		model.addAttribute("name", "홍길동");
		model.addAttribute("name_h1", "<h2 style='color:red;'>홍길동</h2>");
		model.addAttribute("value", "서버값");
		model.addAttribute("var", "변수값");

		return "index1"; //index1.html로 응답함.
	}

}
