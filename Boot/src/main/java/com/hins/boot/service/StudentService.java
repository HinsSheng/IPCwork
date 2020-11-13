package com.hins.boot.service;

import com.hins.boot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> listStudent();
}
