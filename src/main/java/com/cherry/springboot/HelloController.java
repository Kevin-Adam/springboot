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
   //@Autowired
   //private UserProperties userProperties;

    // 从 application.yml 中读取配置，如取不到默认值为Hello Jsp
    @Value("${application.hello:Hello Jsp}")
    private String hello = "Hello Jsp";
    /**
     * 默认页<br/>
     * @RequestMapping("/") 和 @RequestMapping 是有区别的
     * 如果不写参数，则为全局默认页，加入输入404页面，也会自动访问到这个页面。
     * 如果加了参数“/”，则只认为是根页面。
     * 可以通过localhost:8080或者localhost:8080/index访问该方法
     */

    @RequestMapping(value = {"/","/index"})
    public String index(Map<String, Object> map) {
        // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
        // 本例为 /WEB-INF/views/index.jsp
        System.out.println("------------");
        map.put("time", new Date());
        map.put("message", this.hello);
        return "index";

        /*System.out.println("HelloController.helloJsp().hello="+hello);
        map.put("hello", hello);
        //map.put("name", "SpringBoot");
        //map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";*/
    }

}
