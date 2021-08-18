package com.bill.springboot01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
public class TestController {
    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username ,@RequestParam("password") String password){
        System.out.println("login");
        System.out.println(username + "--" +password);
        return "success";
    }
}
