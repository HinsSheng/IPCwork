package com.hins;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.io.IOException;

public class ActiveMQSendTest {
    @Test
    public void send(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MQApplicationContext.xml");
        JmsTemplate jmsTemplate = applicationContext.getBean(JmsTemplate.class);
        Destination queue = applicationContext.getBean(ActiveMQQueue.class);
        Destination topic = applicationContext.getBean(ActiveMQTopic.class);

        jmsTemplate.send(queue, (Session session)->{
            TextMessage message = session.createTextMessage("再来一条消息");
            return message;
        });
    }
    @Test
    public void listen() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MQApplicationContext.xml");
        System.in.read();
    }

}
