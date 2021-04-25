package com.liu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author Mr.liu
 * @title: Relative
 * @projectName com.liu.pojo
 * @description: TODO
 * @date 2021/04/22 9:38
 */

class Friend{
    public void say(){
        System.out.println("我是好兄弟");
    }
}
class Girl{
    public void say(){
        System.out.println("我是女朋友");
    }
}

public class Relative {
    @Resource(name = "friend")
//    @Autowired
//    @Qualifier("friend")
    private Friend friend;
    @Resource(name = "girl")
//    @Autowired
//    @Qualifier("girl")
    private Girl girl;

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public void say(){
        System.out.println("我有好兄弟和女朋友");
        friend.say();
        girl.say();
    }
}
