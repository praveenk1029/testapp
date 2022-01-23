package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/getMessage")
public String getMessage(){
    //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
    return "Hello world!";
}
}

