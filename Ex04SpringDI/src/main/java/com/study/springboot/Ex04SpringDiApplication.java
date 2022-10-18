package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Ex04SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		Member member = (Member)context.getBean("member");
		System.out.println( "ApplicationContext에서 찾은 빈 : " + member.getName() );

		SpringApplication.run(Ex04SpringDiApplication.class, args);
	}

}
