package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world! v2";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
