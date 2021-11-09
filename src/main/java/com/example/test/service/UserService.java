package com.example.test.service;

import com.example.test.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name,String password);
    UserBean check_username(String name);
    void add_user(String name ,String password);
}
