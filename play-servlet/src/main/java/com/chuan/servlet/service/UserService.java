package com.chuan.servlet.service;

import com.chuan.servlet.entity.User;
import com.chuan.servlet.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UserService {
    public User login(User loginUser) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(loginUser.getUsername(), loginUser.getPassword());
            sqlSession.commit();
            sqlSession.close();
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
