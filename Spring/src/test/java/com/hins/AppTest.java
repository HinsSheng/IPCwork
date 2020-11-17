package com.hins;

import static org.junit.Assert.assertTrue;

import com.hins.entity.Hello;
import com.hins.entity.Item;
import com.hins.entity.Oder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
   public void test01(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        Hello hello2 = (Hello) context.getBean("hello");
        System.out.println(hello.hashCode());
        System.out.println(hello2.hashCode());


    }
}
