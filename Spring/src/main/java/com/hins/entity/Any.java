package com.hins.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Any {

    private Integer id;

    private String name;

    @Override
    public String toString() {
        return "Any{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Any() {
    }
    public void printHashCode(){
        System.out.println(this.hashCode());
    }

}
