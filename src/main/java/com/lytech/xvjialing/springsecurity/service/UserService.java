package com.lytech.xvjialing.springsecurity.service;

import com.lytech.xvjialing.springsecurity.bean.User;
import com.lytech.xvjialing.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findByUserNameAndPassword(String username,String password){
        User user=userRepository.findByUsernameAndAndPassword(username,password);
        return user;
    }

    public User register(User user){
        return userRepository.save(user);
    }
}