package com.shardingjdbc.demo.controller;

import com.shardingjdbc.demo.entity.User;
import com.shardingjdbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.listAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/add")
    public void add() {
        userService.add();
    }

}
