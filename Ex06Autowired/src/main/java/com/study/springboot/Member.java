package com.study.springboot;

import org.springframework.stereotype.Component;

//회원정보 클래스
//@Component : 클래스를 Bean으로 등록해준다.
//Bean의 이름은 클래스이름의 첫글자를 소문자로 등록된다 : "member"
@Component
public class Member {
    private String name;
    private ICard iCard;

    //기본생성자 안만들어주면 Bean 등록이 안됨.
    public Member(){

    }
    public Member(String name, ICard iCard) {
        this.name = name;
        this.iCard = iCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICard getiCard() {
        return iCard;
    }

    public void setiCard(ICard iCard) {
        this.iCard = iCard;
    }
}
