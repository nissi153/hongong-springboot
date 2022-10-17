package com.study.springboot;

//회원정보 클래스
public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //싱글톤 만들기
    private static Member m = null;
    public static Member getInstance() {
        if( m == null ) {
            m = new Member("홍길동");
        }
        return m;
    }

}
