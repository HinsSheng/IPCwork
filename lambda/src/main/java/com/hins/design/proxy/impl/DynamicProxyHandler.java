package com.hins.design.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    //被代理对象
    private Object obj;

    public DynamicProxyHandler(final Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法前置通知");
        Object result = method.invoke(obj, args);
        System.out.println("方法后置通知");

        return result;
    }
}
