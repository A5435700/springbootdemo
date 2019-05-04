package com.wuyi.springbootdemo.controller;

import com.wuyi.springbootdemo.service.StudentService;
import com.wuyi.springbootdemo.util.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 陈晓萌
 * 2019/5/3 11:10
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     * 得到
     */
//    (value = "/select",method = {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping("/select")
    public List<Student> getStudent(Student student) {
        return studentService.getStudent(student);
    }

    /**
     * 增加学生信息
     * @param student
     * @return  返回大于0的值则添加成功
     */
    @RequestMapping("/insert")
    public int insertStudent(Student student){
        return studentService.insertStudent(student);
    }

    /**
     * 修改学生信息
     * @param student
     * @return 返回大于0的数值证明修改成功
     */
    @RequestMapping("/update")
    public int updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    /**
     * 删除传入的sid的信息
     * @param sid
     * @return
     */
    @RequestMapping("/del")
    public int delStudent(int sid){
        return studentService.delStudent(sid);
    }
}
