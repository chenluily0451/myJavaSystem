package com.my.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping({"/index", "/"})
    public String indexPage() {
        return "index";
    }



//    @PostMapping("/loginPost")
//    public Object login(@RequestParam(value="username",required = true) String username, @RequestParam(value = "password",required = true) String password, Model model){
//
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        if (username.equals("admin") && password.equals("123456")) {
//            map.put("success",true);
//            return map;
//        } else {
//            model.addAttribute("username", username);
//            return "";
//        }
//    }

    @ResponseBody
    @RequestMapping(value = "/loginPost", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object login(@PathVariable String username, @PathVariable String password, Model model) {
        model.addAttribute("success", true);
        return model;
    }

}
