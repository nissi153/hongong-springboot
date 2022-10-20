package com.study.springboot;

import org.springframework.stereotype.Component;

//@Component 어노테이션 : 클래스를 자바 빈으로 등록해줌.
//@ComponentScan으로 @Component으로 등록된 클래스를 찾아서 빈으로 등록.
//빈객체의 이름은 cardB이다.
@Component("cardB")
public class CardB implements ICard {

    @Override
    public void buy(String itemName) {
        System.out.println("CardB " + itemName + "을 샀다.");
    }

}
