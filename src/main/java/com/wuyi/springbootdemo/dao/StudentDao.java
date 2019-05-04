package com.wuyi.springbootdemo.dao;

import com.wuyi.springbootdemo.util.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 陈晓萌
 * 2019/5/2 17:30
 */
@Repository
public interface StudentDao {
    /**
     * 查询学生信息
     */
//    @Select("select * from student")
    List<Student> getStudent(Student student);

    /**
     * 增加学生信息
     */
     int insertStudent(Student student);

    /**
     *修改学生信息
     */

    int updateStudent(Student student);

    /**
     *删除学生信息
     */
    int delStudent(int sid);
}
