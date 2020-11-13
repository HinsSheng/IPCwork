package com.hins.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author HinsChen
 */
@Data
public class Student {
    private Integer sid;
    private String sname;
    private Date sage;
    private String ssex;
    private List<StudentCourse> studentCourse;
}
