package com.dailycodebuffer.oauthserver.service.impl;

import com.dailycodebuffer.oauthserver.Entity.User;
import com.dailycodebuffer.oauthserver.repository.UserRepository;
import com.dailycodebuffer.oauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User CreateUser(User user) {
        User u=userRepository.save(user);
        return user;
    }
}
