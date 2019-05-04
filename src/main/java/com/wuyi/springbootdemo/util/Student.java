package com.wuyi.springbootdemo.util;

import java.io.Serializable;

/**
 * 陈晓萌
 * 2019/5/2 17:17
 */



public class Student implements Serializable {


    private String sid;
    private String name;
    private String sex;
    private int age;

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
