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

/**
 * REST controller for managing user login records.
 * <p>
 * Provides endpoints to create user login records, retrieve all user login
 * records, retrieve login records by user ID, and insert a login record for a
 * specific user.
 * </p>
 *
 * <ul>
 * <li><b>POST /api/userlogins</b> - Create a new user login record.</li>
 * <li><b>GET /api/userlogins</b> - Retrieve all user login records.</li>
 * <li><b>GET /api/userlogins/{id}</b> - Retrieve login records by user ID.</li>
 * <li><b>POST /api/userlogins/{userid}</b> - Insert a login record for a
 * specific user.</li>
 * </ul>
 *
 * <p>
 * Cross-origin requests are allowed from any origin.
 * </p>
 *
 * @author [Your Name]
 */
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
