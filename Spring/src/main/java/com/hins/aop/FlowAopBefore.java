package com.hins.aop;

import com.hins.service.FlowService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 方法前切入
 * @author HinsChen
 */
@Component
public class FlowAopBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"方法即将执行");
    }
}
