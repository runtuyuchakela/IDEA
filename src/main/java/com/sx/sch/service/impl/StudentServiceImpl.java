package com.sx.sch.service.impl;

import com.sx.sch.mapper.StudentMapper;
import com.sx.sch.pojo.Student;
import com.sx.sch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl {
    //该注解可以对类成员变量、方法以及构造函数进行标注，完成自动装配工作
    @Autowired
    StudentMapper studentMapper;

    public String login(Student student){
        //登录逻辑函数
        try{
            Student studentExistN = studentMapper.findByName(student.getName());
            System.out.println(studentExistN);
            if(studentExistN!=null){
                String studentExistP = studentMapper.findPswByName(student.getName());
                if(studentExistP.equals(student.getPassword())){
                    return "studentDetail";
                }else {
                    return "fail";
                }
            }else {
                return "fail";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    public String regist(Student student){
        //注册逻辑函数
        try {
            Student studentExist = studentMapper.findByName(student.getName());
            if (student.getName().equals("")){
                return "用户名不能为空";
            }else if (student.getPassword().equals("")){
                return "密码不能为空";
            }else if (studentExist!=null){
                return "账户已经存在";
            }else{
                studentMapper.save(student);
                return "注册成功";
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }

    public List<Student> findAll(){
        List<Student> list = studentMapper.findAll();
        return list;
    }

}
