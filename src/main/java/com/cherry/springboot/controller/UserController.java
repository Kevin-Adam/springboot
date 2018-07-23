package com.cherry.springboot.controller;

import com.cherry.springboot.entity.User;
import com.cherry.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author zhangpcxy@163.com
 * @create 2018/7/23 17:14
 * @desc
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/selectByPrimaryKey")
    public String selectUserById(Model model) {
        User user = userService.selectByPrimaryKey(1);
        model.addAttribute("user", user);
        return "user";
    }
}
