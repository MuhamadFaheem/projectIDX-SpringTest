package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

 void addNewUser(User user);
    List<User> findAll();
    User findById(String id);
    void deleteById(String id);
    void update(User user);
    
} 