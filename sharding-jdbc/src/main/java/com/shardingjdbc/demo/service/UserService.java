package com.shardingjdbc.demo.service;

import com.shardingjdbc.demo.entity.User;
import com.shardingjdbc.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void add() {
        User user = new User();
        user.setAge(12);
        user.setEmail("1322@153.com");
        user.setName("xixi");
        userMapper.insert(user);
    }

    public List<User> listAllUser() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

}
