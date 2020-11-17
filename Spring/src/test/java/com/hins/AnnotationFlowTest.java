package com.hins;

import com.hins.service.FlowService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationFlowTest {
    @Test
    public void annotationTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBean.xml");
        FlowService bean =(FlowService)context.getBean("flowServiceImpl");
        bean.controlFlow();

    }
}
