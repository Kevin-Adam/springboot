package com.cherry.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author zhangpcxy@163.com
 * @create 2018/7/11 11:23
 * @desc 测试控制器
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }

}
