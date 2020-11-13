package com.hins.dao;

import com.hins.pojo.Student;

import java.util.List;

/**
 * @author HinsChen
 */
public interface StudentDao {
    Student selectone(String sname);
    List<Student> listStudentsLike(String name);
    List<Student> limitStudentSelect();
}
