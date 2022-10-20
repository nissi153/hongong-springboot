package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 어노테이션 : 사용자의 요청(http request)을 받는다.
@Controller
public class MainController {
    //@Autowired 어노테이션 : @Component로 등록된 Bean을 주입(DI)한다.
    //                      ApplicationContext클래스의  getBean 메서드 역할
    //필드 주입
    @Autowired
    Member member1;
    @Autowired  //@Autowired는 따로따로 써야 됨.
    Member member2;

    //@GetMapping 어노테이션 : http Get 요청을 처리한다.
    @GetMapping("/")
    //@ResponseBody 어노테이션 : 문자열로 응답한다.
    @ResponseBody
    public String main() {
        return "Spring Web App입니다.";
    }

    //호출 URI : http://localhost:8090/member
    @GetMapping("/member")
    @ResponseBody
    public String member() {
        //member1 Bean 사용하기
        member1.setName("홍길동");
        System.out.println( member1.getName() );

        if( member1 == member2 ) {
            System.out.println("서로 같은 객체임.");
        }

        return "member함수 호출됨.";
    }

    @Autowired
    //@Component로 등록된 PrinterA, PrinterB중에 @Qualifier를 이용하여 주입할 객체를 선택
    //선언하지 않으면 어떤 것을 주입해야 할지 몰라서 오류 발생함.
    @Qualifier("cardA")
    ICard iCard;
    //호출 URI : http://localhost:8090/card
    @RequestMapping("/card")
    @ResponseBody
    public String card() {
        //member 빈을 사용하기
        member1.setiCard( iCard );
        member1.getiCard().buy("콩나물");

        return "card함수 호출됨.";
    }
}
