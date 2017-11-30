package com.my.system.mapper;

import com.my.system.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Insert("insert into users(username, password, phone) values(#{username}, #{password}, #{phone})")
    @Options(useGeneratedKeys=true)
    int save(User user);

    @Select("select * from users where id=#{id}")
    User findById(int id);

    @Update("update users set username=#{username}, password=#{password}, phone=#{phone} where id=#{id}")
    int updateUser(User user);

    @Select("select * from users")
    List<User> list();


}
