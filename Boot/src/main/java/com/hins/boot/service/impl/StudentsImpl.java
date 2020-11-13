package com.hins.boot.service.impl;

import com.hins.boot.dao.StudentMapper;
import com.hins.boot.entity.Student;
import com.hins.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HinsChen
 */
@Service
public class StudentsImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listStudent() {
        return studentMapper.listStudent();
    }
}
