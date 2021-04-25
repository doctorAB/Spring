package com.liu.pojo;

/**
 * @author Mr.liu
 * @title: Hello
 * @projectName com.liu.pojo
 * @description: TODO
 * @date 2021/04/21 10:10
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
