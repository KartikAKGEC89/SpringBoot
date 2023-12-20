package com.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello";
    }
}
