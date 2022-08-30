package com.chuan.ioc.ant.bean;

import com.chuan.ioc.bean.IUserDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author xucy-e
 */
// @Scope("prototype")
@Repository
public class UserDAO implements IUserDAO {
    @Override
    public String find() {
        return "123456";
    }

    @PostConstruct
    public void init() {
        System.out.printf("%s is initialized!\n", this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        System.out.printf("%s is destroyed!\n", this.getClass().getSimpleName());
    }
}
