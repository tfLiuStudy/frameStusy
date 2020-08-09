package cn.al.firstStudy.controller;

import cn.al.firstStudy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("paramStudyController")
public class ParamStudyController {

    /**
     * testParam
     * @param user
     * @Author: tfliu
     */
    @RequestMapping(value = "/testParam")
    private String testParam(User user){
        System.out.println(user);
        return "hello";
    }
}
