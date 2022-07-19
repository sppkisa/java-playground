package com.chuan.ioc.bean;

/**
 * @author xucy-e
 */
public interface IUserService {

    String introduce(String userName);

    IUserDAO getUserDAO();
}
