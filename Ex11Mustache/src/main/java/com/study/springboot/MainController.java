package com.study.springboot;

import com.samskivert.mustache.Mustache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

	@GetMapping("/index3")
	public String index3(Model model) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String standardDate = simpleDateFormat.format(new Date());

		model.addAttribute( "standardDate", standardDate );

		DateTimeFormatter dtFormatter1= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dtFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String localDate = LocalDate.now().format(dtFormatter1);
		String localDateTime = LocalDateTime.now().format(dtFormatter2);

		model.addAttribute( "localDate", localDate );
		model.addAttribute( "localDateTime", localDateTime );

		Member member = new Member(0L, "hong", "1234",
				LocalDate.now(), LocalDateTime.now());
		model.addAttribute( "member", member );

		model.addAttribute( "number1", 12345678 );
		model.addAttribute( "number2", 123456.789 );

		return "index3"; //index3.mustache로 응답함.
	}

}
