package com.example.lab.core.security;

public interface SecurityService {
    boolean isAuthenticated();

    void autoLogin(String username, String password);
}
