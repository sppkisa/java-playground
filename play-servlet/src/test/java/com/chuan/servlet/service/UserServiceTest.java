package com.chuan.servlet.service;

import com.chuan.servlet.entity.User;
import org.junit.Test;


public class UserServiceTest {
    @Test
    public void testLogin() {
        User loginUser = new User();
        // loginUser.setId(1);
        loginUser.setUsername("zhangsan");
        loginUser.setPassword("haha");
        UserService userService = new UserService();
        User user = userService.login(loginUser);
        System.out.println(user);
    }
}
