package com.study.springboot.CircularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cheif {
    //필드주입에서의 순환 참조 예제
    //아래 코드를 코멘트 제거하면, 순환참조가 발생합니다.
    /*
    @Autowired
    private Coder coder;
   
    public void cook() {
	   coder.code();
    }
    */
}
