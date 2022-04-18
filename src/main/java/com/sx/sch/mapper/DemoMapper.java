package com.sx.sch.mapper;

import com.sx.sch.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DemoMapper {
    List<Student> findAll();
    Student findByName(String name);
    String findPswByName(String StudentName);
    void save(Student student);
}
