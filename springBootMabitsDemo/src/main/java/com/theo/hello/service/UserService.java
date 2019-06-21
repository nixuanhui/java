package com.theo.hello.service;


import com.theo.hello.dao.UserMapper;
import com.theo.hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public interface UserService {


    public User findUser(int id);
}
