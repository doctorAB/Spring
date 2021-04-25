package com.liu.server;

import com.liu.dao.UserDao;

public interface UserServer {
    void getUser();
    void setUserDao(UserDao userDao);
}

