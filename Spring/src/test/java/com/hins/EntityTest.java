package com.hins;

import com.hins.entity.Any;
import com.hins.entity.Config;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.dc.pr.PRError;

public class EntityTest {
    @Autowired
    private Any any;
    @Test
    public void testAny(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Any any = (Any)context.getBean("Any");
        System.out.println(any.toString());
    }
    @Test
    public void areaTest(){
        System.out.println(any);

    }
    @Test
    public void anyTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Any any = (Any) context.getBean("any");
        System.out.println(any);
    }
}
