package com.tree.service.impl;


import com.tree.dao.StudentDao;
import com.tree.entity.Student;
import com.tree.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;
    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDao.listStudent();
        //return null;
    }
}
