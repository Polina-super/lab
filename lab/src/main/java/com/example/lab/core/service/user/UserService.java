package com.example.lab.core.service.user;

import com.example.lab.infrastructure.database.entities.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
