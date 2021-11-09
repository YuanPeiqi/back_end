package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @GetMapping("/valid_login")
    public boolean login(@RequestParam(value="username", required = false, defaultValue = "") String name,
                         @RequestParam(value="password", required = false, defaultValue = "") String password){
        UserBean userBean = userService.loginIn(name,password);
        System.out.println("Received Username: "+ name);
        System.out.println("Received Password: "+ password);
        System.out.print("Return: ");
        System.out.println(userBean != null);
        return userBean != null;
    }
    @GetMapping("/check_username")
    public boolean check_username(@RequestParam(value="username", required = false, defaultValue = "") String name){
        UserBean userBean = userService.check_username(name);
        System.out.println("Received Username: "+ name);
        System.out.print("Return: ");
        System.out.println(userBean != null);
        return userBean != null;
    }

    @GetMapping("/add_user")
    public void add_user(@RequestParam(value="username", required = false, defaultValue = "") String name,
                         @RequestParam(value="password", required = false, defaultValue = "") String password){
        System.out.println("Received Username: "+ name);
        System.out.println("Received Password: "+ password);
        userService.add_user(name, password);
    }



}
