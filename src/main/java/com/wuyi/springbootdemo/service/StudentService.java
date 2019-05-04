package com.wuyi.springbootdemo.service;

import com.wuyi.springbootdemo.util.Student;

import java.util.List;

/**
 * 陈晓萌
 * 2019/5/2 19:02
 */
public interface StudentService {
    List<Student> getStudent(Student student);
    int insertStudent(Student student);
    int updateStudent(Student student);
    int delStudent(int sid);
}
