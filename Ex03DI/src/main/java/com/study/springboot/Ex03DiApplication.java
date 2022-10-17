package com.study.springboot;

public class Ex03DiApplication {

	public static void main(String[] args) {

		Member m = new Member("홍길동");
		System.out.println( m.getName() );

		//의존주입을 안쓰는 경우
		printName1();

		//의존주입을 사용한 경우
		printName2( null );
		printName2( new Member("이소룡") );
		printName2( Member.getInstance() );
	}

	//의존주입을 안쓰는 경우
	//직접 주입 new를 통한 객체 생성
	public static void printName1() {
		Member m = new Member("이순신");
		System.out.println( m.getName() );
	}

	//의존주입을 사용한 경우
	//외부로부터 객체(자바Bean)을 주입받는다.
	public static void printName2( Member m ) {
		//밖에서 주입을 받는다.
		//널체크를 해서 null safety를 확보한다.
		//그러나 Spring Framework에서는 기본으로 null safety를 보장해준다.
		if( m == null ) {
			System.out.println("m = null입니다.");
			return;
		}
		System.out.println( m.getName() );
	}
}
