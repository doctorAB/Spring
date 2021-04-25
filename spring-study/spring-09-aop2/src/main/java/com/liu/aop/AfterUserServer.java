package com.liu.aop;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.aspectj.AspectJAroundAdvice;

import java.lang.reflect.Method;

/**
 * @author Mr.liu
 * @title: AfterUserServer
 * @projectName com.liu.aop
 * @description: TODO
 * @date 2021/04/25 0:49
 */
public class AfterUserServer implements AfterReturningAdvice {
    //参数说明
    //返回值，目标方法，参数，目标对象
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("目标方法是:"+method.getName());
        System.out.println("目标对象是:"+target.getClass().getName());
        System.out.println("执行操作之后");
    }
}
