package com.study.springboot;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    //사용자 아이디
    @NonNull
    private String username;
    //사용자 비밀번호
    private String password;
}
