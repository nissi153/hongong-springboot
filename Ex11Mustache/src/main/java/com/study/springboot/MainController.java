package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index1")
	public String index1(Model model) {
		
		model.addAttribute("name", "홍길동");
		model.addAttribute("name_html", "<span style='color:red;'>홍길동</span>");
		model.addAttribute("value", "서버값");

		return "index1"; //index1.mustache로 응답함.
	}

	@GetMapping("/index2")
	public String index2(Model model) {

		model.addAttribute("address", "한양");
		model.addAttribute("address_null", null);
		model.addAttribute("address_empty", "");

		return "index2"; //index2.mustache로 응답함.
	}

}
