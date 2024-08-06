package com.example.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TodoApplicationTests {

    @MockBean
    private SomeService someService;

    @Test
    void contextLoads() {
        assertTrue(true);
    }
}
