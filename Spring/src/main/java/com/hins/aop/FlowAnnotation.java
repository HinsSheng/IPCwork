package com.hins.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;

/**
 * @author HinsChen
 */
@Aspect
public class FlowAnnotation {
    @Before("execution(* com.hins.service.FlowService.*(..))")
    public void before(){
        System.out.println("-----方法执行前-----");
    }
    @After("execution(* com.hins.service.FlowService.*(..))")
    public void after(){
        System.out.println("-----方法执行之后-----");

    }
    @Around("execution(* com.hins.service.FlowService.controlFlow(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        System.out.println("方法签名"+pj.getSignature());
        //被注解的方法开始执行
        Object proceed = pj.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);

    }
}
