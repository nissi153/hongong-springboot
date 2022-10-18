package com.study.springboot;

import org.springframework.stereotype.Component;

@Component
public class Member {
    private String name = "사임당";

    
    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

