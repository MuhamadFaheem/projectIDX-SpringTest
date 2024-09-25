package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")
    @PostMapping("/add")    
    public void addNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
    @CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")
    @RequestMapping("/finds")
    public List<User> findAll(){    
        return userService.findAll();
    }
    @CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")

    @RequestMapping("/find/{id}")
    public User findById(@PathVariable String id){
        return userService.findById(id);
    }
    @CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")

    @PutMapping("/update/{id}")
    public void update(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        userService.update(user);
    }
    @CrossOrigin(origins = "https://4200-idx-angular-test-1725506293326.cluster-mwrgkbggpvbq6tvtviraw2knqg.cloudworkstations.dev")

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        userService.deleteById(id);
    }
}