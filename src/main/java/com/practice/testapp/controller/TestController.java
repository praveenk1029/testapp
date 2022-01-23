package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/getInfo")
    public String getInfo(){
        return "getInfo invoked...";
    }
    
    @GetMapping("/getNames")
    public List<String> getNames(){
        return Arrays.asList("Sam", "Nicole", "Rachel");
    }
}
