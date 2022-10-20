package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 어노테이션 : 사용자의 요청(http request)을 받는다.
@Controller
public class MainController {

    //@GetMapping 어노테이션 : http Get 요청을 처리한다.
    @GetMapping("/")
    //@ResponseBody 어노테이션 : 문자열로 응답한다.
    @ResponseBody
    public String main() {
        return "Spring Web App입니다.";
    }
}
