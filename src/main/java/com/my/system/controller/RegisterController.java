package com.my.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenlu on 2017/11/24.
 */
@Controller
public class RegisterController {
    @RequestMapping(value = "/web/register")
    public String login() {
        return "register/register";
    }

    @RequestMapping(value = "/web/register/success")
    public String loginSuccess(String username, String password) {
        System.out.println("userName is " + username);
        System.out.println("password is " + password);

        return "register/registerSuccess";
    }
}
