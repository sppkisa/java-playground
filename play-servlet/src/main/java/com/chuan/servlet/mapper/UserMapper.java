package com.chuan.servlet.mapper;

import com.chuan.servlet.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(User user);

    int deleteById(int userId);

    int update(User user);

    User getUserById(int userId);

    User getUser(@Param("username") String username, @Param("password") String password);
}
