package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

		model.addAttribute( "number1", 12345678 );
		model.addAttribute( "number2", 123456.789 );

		return "index3"; //index3.html로 응답함.
	}

	@GetMapping("/index4")
	public String index4(Model model) {

		model.addAttribute("web", "web");

		model.addAttribute("role", "admin");

		return "index4"; //index4.html로 응답함.
	}

	@GetMapping("index5")
	public String index5(Model model) {

		Member member = new Member("hong", "1234");
		model.addAttribute("member", member);

		List<Member> list = new ArrayList<Member>();
		list.add( new Member("lee", "2222")  );
		list.add( new Member("hana", "3333")  );
		list.add( new Member("tom", "4444")  );
		model.addAttribute("list", list);

		return "index5"; //index5.html로 응답함.
	}
}
