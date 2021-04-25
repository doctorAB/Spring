package com.liu.proxy.sta;

import org.junit.Test;

/**
 * @author Mr.liu
 * @title: Main
 * @projectName com.liu.proxy.sta
 * @description: TODO
 * @date 2021/04/22 16:40
 */

//继承接口
//学生
class Student implements WhoTask {
    //学生的具体目标
    public void study() {
        System.out.println("要好好学习");
    }
}

//继承接口
//老师
class Teacher implements WhoTask {
    //帮助哪位同学好好学习
    WhoTask whoTask;
    Teacher(WhoTask whoTask){
        this.whoTask = whoTask;
    }

    //如何帮助该同学好好学习
    public void study() {
        beforeClass();
        whoTask.study();
        afterClass();
    }

    //上课前
    public void beforeClass(){
        System.out.println("课前要督促预习");
    }

    //上课后
    public void afterClass(){
        System.out.println("课后要布置作业");
    }
}

public class Main {
    public static void main(String[] args) {
        //创建学生
        Student student = new Student();
        //为学生安排老师
        Teacher teacher = new Teacher(student);
        //老师监督学生学习(老师作为代理者帮助被代理者学生完成学习的任务)
        teacher.study();
    }
}
