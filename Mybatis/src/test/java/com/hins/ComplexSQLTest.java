package com.hins;

import com.hins.dao.StudentDao;
import com.hins.dao.TeacherDao;
import com.hins.mapper.StudentMapper;
import com.hins.pojo.Student;
import com.hins.pojo.Teacher;
import com.hins.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 复杂Sql语句测试
 */
public class ComplexSQLTest {
    private SqlSession session = MybatisUtils.getSession();

    @Test
    public void limit() {
        StudentDao mapper = session.getMapper(StudentDao.class);
        List<Student> list = mapper.limitStudentSelect();
        list.forEach(student -> {
            System.out.println(student);
        });
    }

    @Test
    public void teacherSearch() {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        List<Teacher> teachers = mapper.selectAll();
        teachers.forEach(teacher -> {
            System.out.println(teacher);
        });
    }

    @Test
    public void studentSCById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        com.hins.dto.Student student = mapper.getStudent(02);
        student.getStudentCourse().forEach(sc->{
            System.out.println(sc);
        });
        System.out.println(student);


    }

}
