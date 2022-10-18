package com.study.springboot;

import org.springframework.stereotype.Component;

@Component
public class Member {
    private String name = "사임당";

    //기본생성자
    //기본생성자 안 만들어주면 빈 등록이 안됨.
    public Member() {
    }
    //필드가 있는 생성자
    public Member(String name) {
        this.name = name;
    }
    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
}

