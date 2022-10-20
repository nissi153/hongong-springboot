package com.study.springboot;

import org.springframework.stereotype.Component;

//@Component 어노테이션 : 클래스를 자바 빈으로 등록해줌.
//@ComponentScan으로 @Component으로 등록된 클래스를 찾아서 빈으로 등록.
//빈객체의 이름은 cardA이다.
@Component("cardA")
public class CardA implements ICard {

    @Override
    public void buy(String itemName) {
        System.out.println("CardA " + itemName + "을 샀다.");
    }

}