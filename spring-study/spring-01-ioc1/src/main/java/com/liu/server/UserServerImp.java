package com.liu.server;

import com.liu.dao.UserDao;
import com.liu.dao.UserDaoImp;

/**
 * @author Mr.liu
 * @title: UserServerImp
 * @projectName com.liu.server
 * @description: TODO
 * @date 2021/04/20 17:04
 */
public class UserServerImp implements UserServer{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
