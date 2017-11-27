package com.my.system.service.user;

import com.my.system.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 修改用户
     */
    boolean updateUser(User user);

    /**
     * 通过id查询用户
     */
    User findById(int id);

    /**
     * 获取用户列表
     */
    List<User> findUserList();


}
