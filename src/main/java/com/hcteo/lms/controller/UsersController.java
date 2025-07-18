/**
 * Controller for managing Users in the LMS application.
 * Provides REST endpoints for creating, retrieving, updating, deleting users, and login check.
 *
 * Endpoints:
 * <ul>
 * <li>POST /api/users - Create a new user</li>
 * <li>GET /api/users - Retrieve all users</li>
 * <li>GET /api/users/{id} - Retrieve a user by ID</li>
 * <li>PUT /api/users/{id} - Update a user by ID</li>
 * <li>DELETE /api/users/{id} - Delete a user by ID</li>
 * <li>GET /api/users/em/{email}/pw/{password} - Login check by email and
 * password</li>
 * </ul>
 *
 * Cross-origin requests are allowed from any origin.
 */
package com.hcteo.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcteo.lms.model.Users;
import com.hcteo.lms.service.UsersService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UsersService usersService;

    // create
    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return usersService.createUser(user);
    }

    // get all users
    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    // get user by id
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = usersService.getUserById(id).orElseThrow();
        return ResponseEntity.ok(user);
    }

    // update user
    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
        return usersService.updateUser(id, user);
    }

    // delete user by id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        usersService.deleteUserById(id);
    }

    // login check
    @GetMapping("/em/{email}/pw/{password}")
    public ResponseEntity<Users> loginCheck(@PathVariable String email, @PathVariable String password) {
        Users user = usersService.getUserByEmailPassword(email, password);
        return ResponseEntity.ok(user);
    }
}
