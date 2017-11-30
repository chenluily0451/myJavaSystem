package com.my.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenlu on 2017/11/30.
 */
@Controller
public class ListController {
    @RequestMapping(value = "/web/list")
    public String login() {
        return "list/list";
    }
}
