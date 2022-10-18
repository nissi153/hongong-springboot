package com.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Member member(){
        System.out.println("AppConfig.member 빈으로 등록됨.");
        return new Member("머스크");
    }

}
