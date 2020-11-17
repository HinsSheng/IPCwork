package com.hins.boot;

import com.hins.boot.entity.Student;
import com.hins.boot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootTest
class BootApplicationTests {
@Autowired
private  StudentService studentService;
    @Test
    void contextLoads() {
        List<Student> list = studentService.listStudent();
        list.sort((a,b)-> Integer.valueOf(b.getSid())-Integer.valueOf(a.getSid()));
        //list.removeIf(ele->ele.getSid().equals("06"));
        list.forEach(System.out::println);
        //list转MAP
        Map<String, Student> map = list.stream().collect(Collectors.toMap(Student::getSid, Function.identity(), (key1, key2) -> key2));
        map.forEach((key,value)->{
            System.out.println("键 = "+key +"    值等于"+value);
        });


    }

}
