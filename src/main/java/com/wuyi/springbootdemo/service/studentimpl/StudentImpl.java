package com.wuyi.springbootdemo.service.studentimpl;

import com.wuyi.springbootdemo.dao.StudentDao;
import com.wuyi.springbootdemo.service.StudentService;
import com.wuyi.springbootdemo.util.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 陈晓萌
 * 2019/5/2 19:11
 */
@Service
public class StudentImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> getStudent(Student student) {
        String str = student.getName();
        return studentDao.getStudent(student);
    }

    @Override
    public int insertStudent(Student student) {
        if (student.getName()!=null) {
            return studentDao.insertStudent(student);
        }else {
            return 0;
        }
    }

    @Override
    public int updateStudent(Student student) {
        if (student.getSid() != null) {
            return studentDao.updateStudent(student);
        }else {
            return 0;
        }
    }

    @Override
    public int delStudent(int sid) {
        return studentDao.delStudent(sid);
    }
}
