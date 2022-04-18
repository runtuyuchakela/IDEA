package com.sx.sch.service;

import com.sx.sch.pojo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface DemoService {
    Student findStudentByNum(HttpServletRequest request, HttpServletResponse response);
}
