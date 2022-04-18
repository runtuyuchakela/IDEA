package com.sx.sch.controller;

import com.sx.sch.pojo.Student;
import com.sx.sch.service.StudentService;
import com.sx.sch.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
//注册页面
    @RequestMapping("/studentRegist")
    public String studentRegist(Model model) {
        return "studentRegist";
    }

//    登陆页面
    @RequestMapping("/studentLogin")
    public String studentLogin(Model model){
        return "studentLogin";
    }
//    实现登录
    @RequestMapping("/doStudentLogin")
    public String doStudentLogin(Model model, HttpServletRequest request, HttpServletResponse response){
        String name=(String)request.getParameter("name");
        String password=(String)request.getParameter("password");
        Student stu=new Student();
        stu.setName(name);
        stu.setPassword(password);
        String msg=studentService.login(stu);
        if(msg.equals("studentDetail")){
            model.addAttribute("student",stu);
        }
        return msg;
    }
    /**
     * 解决查询数据库中文出现乱码问题
     *
     * @return
     */
//    @RequestMapping(value = "/allstudent", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
//    public List<Student> findAll() {
//        return studentService.findAll();
//    }
}
