package com.lytech.xvjialing.springsecurity.repository;

import com.lytech.xvjialing.springsecurity.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByUsernameAndAndPassword(String username,String password);
}