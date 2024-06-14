package com.dailycodebuffer.oauthserver.service;

import com.dailycodebuffer.oauthserver.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User CreateUser(User user);
}
