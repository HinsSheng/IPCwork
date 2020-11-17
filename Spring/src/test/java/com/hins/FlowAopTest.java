package com.hins;

import com.hins.service.FlowService;
import com.hins.service.impl.FlowServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlowAopTest {
    @Test
    public void BeforeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        FlowService flowServiceImpl = (FlowService)context.getBean("flowServiceImpl");


        flowServiceImpl.controlFlow();

    }
}
