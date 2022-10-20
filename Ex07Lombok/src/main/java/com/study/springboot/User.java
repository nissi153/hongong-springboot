package com.study.springboot;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Data
class User {
    private final String username;
    @NonNull
    private String password;
}
