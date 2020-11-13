package com.hins.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author HinsChen
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}

