package com.my.system.controller.user;

import com.my.system.entity.User;
import com.my.system.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User addUser(@RequestBody User user) {
        int id = userService.addUser(user);
        User u = userService.findById(id);
        return u;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        User user = userService.findById(id);
        return user;
    }

    @GetMapping
    public List<User> getUserList() {
        List<User> userList = userService.findUserList();
        return userList;
    }
}
