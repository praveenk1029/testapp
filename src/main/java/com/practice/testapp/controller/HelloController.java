package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getMessage")
    public String getMessage() {
        //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
        String name = "Sam";
        String address = "Karimnagar";
        return "Hello world!";
    }
}

