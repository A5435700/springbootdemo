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
     * 查询
     * 可根据  name,age,sex 属性
     * @param student
     * @return
     */
//    (value = "/select",method = {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping("/select")
    public List<Student> getStudent(Student student) {
        //System.out.println("---"+student.getSex()+"---"+student.getName()+"---"+student.getAge()+"---");
        return studentService.getStudent(student);
    }

    /**
     * 添加
     * name为必填，其他随意
     * @param student
     * @return  返回大于0的值则添加成功
     */
    @RequestMapping("/insert")
    public int insertStudent(Student student){
        return studentService.insertStudent(student);
    }

    /**
     * 修改
     * 根据sid进行修改
     * @param student
     * @return 返回大于0的数值证明修改成功
     */
    @RequestMapping("/update")
    public int updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    /**
     * 删除
     * 传入的sid进行删除
     * @param sid
     * @return
     */
    @RequestMapping("/del")
    public int delStudent(int sid){
        return studentService.delStudent(sid);
    }
}
