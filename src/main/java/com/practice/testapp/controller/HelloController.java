package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/getMessage")
public String getMessage(){
    return "Hello world!";
}
}

