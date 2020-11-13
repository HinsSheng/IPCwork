package com.hins.entity;

public class Hello {
    private String name;

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public Hello() {
        System.out.println("helo使用无参构造函数");
    }

    public Hello(String name) {
        this.name = name;
        System.out.println(Hello.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("show 方法被调用  name=="+name);
    }
}
