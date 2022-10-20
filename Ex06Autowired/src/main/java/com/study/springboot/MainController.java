package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 어노테이션 : 사용자의 요청(http request)을 받는다.
//                       : 자바에서 요청을 처리하는 클래스(HttpServlet클래스)를 상속받음.
@Controller
//@ResponseBody 어노테이션 : 응답을 문자열로 해줄때 사용. JSON/XML응답일때 주로 사용. RestfullAPI 호출시에 사용.
@ResponseBody
//@RestController : @Controller + @ResponseBody
public class MainController {
    //@Autowired 어노테이션 : @Component로 등록 빈을 주입(DI)한다. getBean함수 역할
    //필드 주입
    @Autowired
    Member member1;
    @Autowired  //@Autowired는 따로따로 써야 됨.
    Member member2;

    //주입의 3가지 형태
    //1.필드(field) 주입 : 가장 기본적인 형식, final을 사용불가
    //2.수정자(setter) 주입 : final을 사용불가
    //3.생성자(constructor) 주입 : 최근에 추천되는 방식, final 사용가능

    //호출 URI : http://localhost:8090/
    //@RequestMapping 어노테이션 : URI(URL) 패턴(경로)를 지정해 줌.
    //@GetMapping : Get호출에 대한 경로 지정
    //@PostMapping : Post호출에 대한 경로 지정
    //@RequestMapping : Get, Post 모든 호출에 대한 경로 지정
    @RequestMapping("/")
    public String main() {
        return "Spring Web App입니다.";
    }

    //호출 URI : http://localhost:8090/member
    @RequestMapping("/member")
    public String member() {
        //member 빈을 사용하기
        member1.setName("홍길동");
        System.out.println( member1.getName() );

        if( member1 == member2 ) {
            System.out.println("서로 같은 객체임.");
        }

        return "member함수 호출됨.";
    }

    @Autowired
    @Qualifier("cardB")
    ICard iCard;  //@Component로 등록된 PrinterA, PrinterB중에
                  //어떤 것을 주입해야 할지 몰라서 오류!
                  //@Qualifier를 이용하여 주입할 객체를 선택해준다.

    //호출 URI : http://localhost:8090/card
    @RequestMapping("/card")
    public String card() {
        //member 빈을 사용하기
        member1.setiCard( iCard );
        member1.getiCard().buy( "샤넬백" );

        return "card함수 호출됨.";
    }
}
