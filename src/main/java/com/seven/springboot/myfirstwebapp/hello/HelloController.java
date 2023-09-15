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

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String helloHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>myFirstPage</title>");
        sb.append("<head>");
        sb.append("<body>");
        sb.append("<h2>My First Html Page with Body!</h2>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp")
    public String helloJsp() {
        return "sayHello";
    }
}

