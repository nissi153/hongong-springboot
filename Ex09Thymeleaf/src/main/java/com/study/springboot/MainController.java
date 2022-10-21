package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		return "redirect:index1";
	}
	
	@GetMapping("/index1")
	public String index1(Model model) {
		
		model.addAttribute("name", "홍길동");
		model.addAttribute("name_html", "<h2 style='color:red;'>홍길동</h2>");
		model.addAttribute("value", "서버값");
		model.addAttribute("var", "변수값");

		return "index1"; //index1.html로 응답함.
	}

	@GetMapping("/index2")
	public String index2(Model model) {

		model.addAttribute("address", "한양");
		model.addAttribute("address_null", null);
		model.addAttribute("address_empty", "");

		return "index2"; //index2.html로 응답함.
	}

	@GetMapping("/index3")
	public String index3(Model model) {

		model.addAttribute( "standardDate", new Date() );
		model.addAttribute( "localDate", LocalDate.now() );
		model.addAttribute( "localDateTime", LocalDateTime.now() );

		return "index3"; //index3.html로 응답함.
	}
}
