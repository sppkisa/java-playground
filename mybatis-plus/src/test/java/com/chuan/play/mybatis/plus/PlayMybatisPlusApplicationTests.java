package com.chuan.play.mybatis.plus;

import com.chuan.play.mybatis.plus.dao.UserMapper;
import com.chuan.play.mybatis.plus.entity.User;
import com.chuan.play.mybatis.plus.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PlayMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void testSelect() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(6, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testUserService() {
        User byNumber = userService.getById(1);
        User byString = userService.getById("1");
        Assertions.assertEquals(byNumber, byString);
        System.out.printf("byNumber: %s\nbyString: %s%n", byNumber, byString);
    }

    @Test
    public void testInsert() throws InterruptedException {
        User user = new User();
        user.setId(10086L);
        user.setName("xucy-e");
        user.setEmail("xucy-e@glodon.com");
        user.setAge(18);
        userMapper.insert(user);
        Thread.sleep(1000);
        userMapper.updateById(user);
    }

    @Test
    public void testDelete() {
        userMapper.deleteById(10086L);
    }

}
