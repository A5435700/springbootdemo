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
    private Integer age;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
