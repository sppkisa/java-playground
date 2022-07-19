package com.chuan.ioc.ant.bean;

import com.chuan.ioc.bean.IUserDAO;
import com.chuan.ioc.bean.IUserService;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author xucy-e
 */
@Service
public class UserServiceWithLookup implements IUserService {

    @Lookup
    @Override
    public IUserDAO getUserDAO() {
        return null;
    }

    @Override
    public String introduce(String userName) {
        return String.format("I am %s.", userName);
    }
}
