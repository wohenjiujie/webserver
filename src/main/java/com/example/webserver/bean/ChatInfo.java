package com.example.webserver.bean;

/**
 * Created by INvo
 * on 2020/1/8.
 *
 * 封装
 */
public class ChatInfo <T>{
    private T user;
    private T password;

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }
}
