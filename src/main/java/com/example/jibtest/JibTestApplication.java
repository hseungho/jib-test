package com.example.jibtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JibTestApplication.class, args);
    }

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello JIB World";
    }
}
