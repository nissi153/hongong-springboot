package com.study.springboot;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class User {
    private final String username;
    @NonNull
    private String password;
}
