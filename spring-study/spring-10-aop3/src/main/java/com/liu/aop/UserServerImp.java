package com.liu.aop;

import org.springframework.stereotype.Component;

/**
 * @author Mr.liu
 * @title: UserServerImp
 * @projectName com.liu.aop
 * @description: TODO
 * @date 2021/04/25 1:07
 */

@Component("userServerImp")
public class UserServerImp implements UserServer{
    public void add() {
        System.out.println("进行add操作");
    }

    public void delete() {
        System.out.println("进行delete操作");
    }

    public void update() {
        System.out.println("进行update操作");
    }

    public void query() {
        System.out.println("进行query操作");
    }
}
