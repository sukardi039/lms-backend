package com.hcteo.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcteo.lms.model.UserLogin;
import com.hcteo.lms.service.UserLoginService;

@RestController
@RequestMapping("/api/userlogins")
@CrossOrigin(origins = "*")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    // create
    @PostMapping
    public UserLogin createUserLogin(@RequestBody UserLogin userLogin) {
        return userLoginService.createUserLogin(userLogin);
    }

    // get user login list
    @GetMapping
    public List<UserLogin> getAllUserLogin() {
        return userLoginService.getAllLogins();
    }

    // get by user id
    @GetMapping("/{id}")
    public List<UserLogin> getByUserId(@PathVariable Long id) {
        return userLoginService.getByUserId(id);
    }

    // insert login record
    @PostMapping("/{userid}")
    public UserLogin insertUserLogin(@PathVariable Long userid) {
        return userLoginService.insertUserLogin(userid);
    }
}
