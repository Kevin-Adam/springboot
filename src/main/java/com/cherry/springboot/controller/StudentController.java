package com.cherry.springboot.controller;

import com.cherry.springboot.dao.IStudentDao;
import com.cherry.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 11:49
 * @desc
 */
@Controller
public class StudentController {

    @Autowired
    private IStudentDao iStudentDao;

    @RequestMapping("/student")
    public String listStudent(Model model) {
        List<Student> students = iStudentDao.selectAll();
        model.addAttribute("students", students);
        return "student";
    }
}
