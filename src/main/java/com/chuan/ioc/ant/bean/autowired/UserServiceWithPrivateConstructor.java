package com.chuan.ioc.ant.bean.autowired;

import com.chuan.ioc.bean.IUserDAO;
import com.chuan.ioc.bean.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Lazy
@Service
public class UserServiceWithPrivateConstructor implements IUserService {

    @Autowired
    private UserServiceWithPrivateConstructor() {
        System.out.println("---------------come in private constructor---------------");
    }

    @Override
    public String introduce(String userName) {
        return null;
    }

    @Override
    public IUserDAO getUserDAO() {
        return null;
    }
}
