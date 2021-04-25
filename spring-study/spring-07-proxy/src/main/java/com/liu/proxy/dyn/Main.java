package com.liu.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Mr.liu
 * @title: Main
 * @projectName com.liu.proxy.dyn
 * @description: TODO
 * @date 2021/04/22 17:32
 */

//继承接口
//学校
class School implements InvocationHandler{

    //帮助哪位同学好好学习
    WhoTask whoTask;
    School(WhoTask whoTask){
        this.whoTask = whoTask;
    }

    //安排老师
    public Object getTeacher(){
        //三个参数：
        //Loader()：要代理的函数名
        ClassLoader classLoader = whoTask.getClass().getClassLoader();
        //interfaces:要代理的函数的参数,是接口
        Class[] interfaces =whoTask.getClass().getInterfaces();
        //h(handler)：实现了InvocationHandler接口的对象，该类中要实现invoke（）方法
        InvocationHandler handler = this;
        return Proxy.newProxyInstance(whoTask.getClass().getClassLoader(), whoTask.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeClass();
        Object object = method.invoke(whoTask,args);
        afterClass();
        return object;
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

//继承接口
//学生
class Student implements WhoTask{
    public void study() {
        System.out.println("要好好学习");
    }
}

public class Main{
    public static void main(String[] args) {
        //创建学生
        Student student = new Student();
        //创建学校，把学生放入学校
        School school = new School(student);
        //学校为学生分配老师进行学习，这里的老师隐藏了
        WhoTask teacher = (WhoTask)school.getTeacher();
        teacher.study();
    }
}
