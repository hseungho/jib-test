package com.example.jibtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
public class JibTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JibTestApplication.class, args);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello JIB World";
    }
}
