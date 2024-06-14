package com.dailycodebuffer.oauthserver.controller;

import com.dailycodebuffer.oauthserver.Entity.User;
import com.dailycodebuffer.oauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody User user){
        User u=userService.CreateUser(user);
        return ResponseEntity.ok("User created Successfully");

    }

}
