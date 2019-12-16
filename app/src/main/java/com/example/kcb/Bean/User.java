package com.example.kcb.Bean;



public class User {
    private static String username;
    private static String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        User.password = password;
    }

    private static User user = new User();

    private User() {
    }

    public static User getInstance() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        User.username = username;
    }
}
