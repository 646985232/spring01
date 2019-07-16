package com.example.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


    @GetMapping("hello")
    @ResponseBody
    public String Wellcome(){
        String a="aaa";
        return "你好";
    }
    public String Wellcome1(String a){
        a="aaa";
        return "你好";
    }
    public String Wellcome2(){
        String a="aaa";
        return "你好";
    }

}
