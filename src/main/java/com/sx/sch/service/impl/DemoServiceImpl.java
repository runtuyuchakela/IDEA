package com.sx.sch.service.impl;

import com.sx.sch.mapper.DemoMapper;
import com.sx.sch.pojo.Student;
import com.sx.sch.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoMapper demoMapper;


    @Override
    public Student findStudentByNum(HttpServletRequest request, HttpServletResponse response) {
        return demoMapper.findByName(request.getParameter("name"));
    }
}
