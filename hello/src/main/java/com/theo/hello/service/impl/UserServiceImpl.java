package com.theo.hello.service.impl;

import com.theo.hello.dao.UserMapper;
import com.theo.hello.entity.User;
import com.theo.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
