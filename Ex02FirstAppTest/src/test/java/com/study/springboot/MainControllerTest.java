package com.study.springboot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void main() throws Exception{
        String hello = "Hello Springboot!!";

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}