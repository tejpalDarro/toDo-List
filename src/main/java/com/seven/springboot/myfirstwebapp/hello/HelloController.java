package com.seven.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    private String hello() {
        return "Hello! What are you learing today!";
    }
}
