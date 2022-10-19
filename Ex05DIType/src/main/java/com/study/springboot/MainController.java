package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "스프링 웹 애플리케이션";
    }

    //1. 필드주입, final 사용불가
    @Autowired
    private Member member1; //스프링 역할 : Member member1 = new Member();

    @GetMapping("/field")
    @ResponseBody
    public String field(){
        System.out.println( member1.getName() );
        return "field() 호출됨.";
    }

    //2. 수정자 주입, final 사용불가
    private Member member2;

    @Autowired
    public void setMember(Member member) {  //스프링 역할 : Member member1 = new Member();
        this.member2 = member;
    }

    @GetMapping("/setter")
    @ResponseBody
    public String setter(){
        System.out.println( member2.getName() );
        return "setter() 호출됨.";
    }

    //3. 생성자 주입, final 사용가능
    private final Member member3;

    @Autowired
    public MainController(Member member) { //스프링 역할 : Member member1 = new Member();
        System.out.println("생성자 주입!");
        this.member3 = member;
    }

    @GetMapping("/constructor")
    @ResponseBody
    public String constructor(){
        System.out.println( member3.getName() );
        return "constructor() 호출됨.456";
    }
}
