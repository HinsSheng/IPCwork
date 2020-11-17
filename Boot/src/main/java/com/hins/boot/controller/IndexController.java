package com.hins.boot.controller;

import com.hins.boot.entity.Student;
import com.hins.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(){
        List<Student> students = studentService.listStudent();
        students.sort((a,b)-> Integer.valueOf(b.getSid())-Integer.valueOf(a.getSid()));
         return students.toString();
    }

}
