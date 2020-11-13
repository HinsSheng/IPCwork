package com.hins.dao;

import com.hins.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherDao {
    /**
     * 注解实现sql语句 特定情况下可以使用  不需要mapper.xml映射文件 利用了JVM的动态代理机制
     * @return
     */
    @Select("select * from Teacher")
    List<Teacher> selectAll();
}
