package com.sx.sch.controller;

import com.sx.sch.mapper.DemoMapper;
import com.sx.sch.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoMapper;
    @RequestMapping("/login")
    public String login(Model model){

        return "studentLogin";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Model model){

        return "studentDetail";
    }
}
