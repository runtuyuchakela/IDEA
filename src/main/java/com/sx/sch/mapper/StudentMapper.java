package com.sx.sch.mapper;

import com.sx.sch.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository将类标识为bean
@Repository
@Mapper
public interface StudentMapper {
    List<Student> findAll();
    Student findByName(String name);
    String findPswByName(String StudentName);
    void save(Student student);
}