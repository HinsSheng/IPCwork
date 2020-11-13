package com.hins.aop;

/**
 * @author HinsChen
 */
public class AnyAopPointcut {
    public void before(){
        System.out.println("方法执行前执行该方法");
    }
    public void after(){
        System.out.println("方法执行后执行该方法");
    }
}
