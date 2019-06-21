package com.theo.hello.controller;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
