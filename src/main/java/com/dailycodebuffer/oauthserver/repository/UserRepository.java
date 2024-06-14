package com.dailycodebuffer.oauthserver.repository;

import com.dailycodebuffer.oauthserver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
