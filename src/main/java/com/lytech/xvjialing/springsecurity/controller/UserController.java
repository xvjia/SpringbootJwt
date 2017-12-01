package com.lytech.xvjialing.springsecurity.controller;

import com.lytech.xvjialing.springsecurity.bean.User;
import com.lytech.xvjialing.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/signup")
    public User signup(User user){
        return userService.register(user);
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/write")
    public String write(){
        return "write?";
    }

}