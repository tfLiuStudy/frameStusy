package cn.al.firstStudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springMVC，入门学习
 */
@Controller("helloController")
public class HelloController {

    /**
     * sayHello --- testMVC
     *
     * @return
     */
    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("HelloController 的 sayHello 方法执行了。。。。");
        return "hello";
    }
}
