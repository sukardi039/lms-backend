package com.hcteo.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcteo.lms.model.UserLogin;
import com.hcteo.lms.repository.UserLoginRepository;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginRepository userLoginRepository;

    // add
    public UserLogin createUserLogin(UserLogin userLogin) {
        return userLoginRepository.saveAndFlush(userLogin);
    }

    // create UserLogin
    public UserLogin insertUserLogin(Long userid) {
        return userLoginRepository.keepLogin(userid);
    }

    // get all logins
    public List<UserLogin> getAllLogins() {
        return userLoginRepository.findAll();
    }

    // get by userId
    public List<UserLogin> getByUserId(Long userid) {
        return userLoginRepository.findByUserId(userid);
    }
}
