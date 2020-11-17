package com.hins.test;


import com.tree.entity.Student;
import com.tree.service.StudentService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class firstTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        StudentService service =  context.getBean(StudentService.class);
        List<Student> students = service.getAllStudent();
        students.forEach(student -> {
            System.out.println(student);
        });
    }
    @Ignore
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SqlSession bean = context.getBean(SqlSession.class);
        System.out.println(bean);
    }
}
