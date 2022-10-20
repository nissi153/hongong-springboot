package com.study.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Lombok 예제입니다.";
    }

    private final Member member;

    //<삭제된 부분
    //@Autowired
    //public MainController(Member member) {
    //    this.member = member;
    //}
    //삭제된 부분>
}
