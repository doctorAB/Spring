package com.liu.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Mr.liu
 * @title: BeforeUserServer
 * @projectName com.liu.aop
 * @description: TODO
 * @date 2021/04/25 0:45
 */
public class BeforeUserServer implements MethodBeforeAdvice {
    //参数说明
    //目标方法，参数，目标对象
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("目标方法是:"+method.getName());
        System.out.println("目标对象是:"+target.getClass().getName());
        System.out.println("执行操作之前");
    }
}
