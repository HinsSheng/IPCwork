package com.hins;

import com.hins.entity.Any;
import com.hins.service.FlowService;
import com.hins.service.impl.FlowServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class FlowServiceTest {

    @Test
    public void endTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("PointcutBean.xml");
        FlowService bean =(FlowService)context.getBean("flowServiceImpl");
        bean.controlFlow();
        bean.changeKey("测试");

    }

}
