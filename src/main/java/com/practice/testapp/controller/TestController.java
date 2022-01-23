package com.practice.testapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String getInfo(){
        return "getInfo invoked...";
    }
}
