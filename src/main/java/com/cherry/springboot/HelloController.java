package com.cherry.springboot;

import com.cherry.springboot.entity.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


/**
 * @author zhangpcxy@163.com
 * @create 2018/7/11 11:23
 * @desc 测试控制器  /  测试controller跳转到jsp页面
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "hello";
    }
}
