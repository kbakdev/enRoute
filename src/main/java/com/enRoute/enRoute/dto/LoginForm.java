package com.enRoute.enRoute.dto;

/**
 * @author Kacper Bąk
 * It is a simple form of login, thanks to which we can download login and password.
 */


public class LoginForm {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}