package com.my.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenlu on 2017/11/24.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/web/login")
    public String login() {
        return "login/login";
    }

    @RequestMapping(value = "/web/login/success")
    public String loginSuccess(String username, String password) {
        System.out.println("userName is " + username);
        System.out.println("password is " + password);

        return "login/loginSuccess";
    }
}
