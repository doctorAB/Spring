package com.liu.pojo;

/**
 * @author Mr.liu
 * @title: User
 * @projectName com.liu.pojo
 * @description: TODO
 * @date 2021/04/21 11:21
 */
public class User {
    private  String name;

    public User(){
        System.out.println("User的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name"+name);
    }
}
