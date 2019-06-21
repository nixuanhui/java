package com.theo.hello.controller;


import com.theo.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/testUser")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable int id){
        return userService.findUser(id).toString();
    }

}
