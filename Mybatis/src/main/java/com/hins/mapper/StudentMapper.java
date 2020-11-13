package com.hins.mapper;

import com.hins.dto.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author HinsChen
 */
public interface StudentMapper {

    Student getStudent(@Param("id") Integer id);
}
