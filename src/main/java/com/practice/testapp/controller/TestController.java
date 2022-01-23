package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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
