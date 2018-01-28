package com.example.controller;

/**
 * Created by Administrator on 1/28/2018.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "hi";
    }



}
