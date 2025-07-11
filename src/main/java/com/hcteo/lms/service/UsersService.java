/**
 * Service class for managing Users entities.
 * Provides methods for creating, retrieving, updating, and deleting users,
 * as well as authentication-related operations.
 *
 * <p>
 * Methods:</p>
 * <ul>
 * <li>{@link #createUser(Users)} - Creates and saves a new user.</li>
 * <li>{@link #getAllUsers()} - Retrieves all users from the repository.</li>
 * <li>{@link #getUserById(Long)} - Retrieves a user by their unique ID.</li>
 * <li>{@link #updateUser(Long, Users)} - Updates an existing user's
 * details.</li>
 * <li>{@link #deleteUserById(Long)} - Deletes a user by their unique ID.</li>
 * <li>{@link #getUserByEmailPassword(String, String)} - Retrieves a user by
 * email and password.</li>
 * </ul>
 *
 * <p>
 * This service uses {@link UsersRepository} for data access operations.</p>
 */
package com.hcteo.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcteo.lms.model.Users;
import com.hcteo.lms.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;
    // private UserLoginService userLoginService;

    // create
    public Users createUser(Users users) {
        return usersRepository.saveAndFlush(users);
    }

    // get all users
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    // get user by id
    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    // update user
    public Users updateUser(Long id, Users user) {
        Users originalUser = usersRepository.findById(id).orElseThrow();
        originalUser.setName(user.getName());
        originalUser.setEmailAddress(user.getEmailAddress());
        originalUser.setMobileNumber(user.getMobileNumber());
        originalUser.setAddress(user.getAddress());
        originalUser.setRole(user.getRole());
        originalUser.setStatus(user.getStatus());
        return usersRepository.save(originalUser);
    }

    // delete by id
    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }

    // get by email password
    public Users getUserByEmailPassword(String email, String password) {
        return usersRepository.findUserByEmailPassword(email, password);
        // if (email.equals(user.getEmailAddress())) {
        //     userLoginService.insertUserLogin(user.getUser_id());
        // }

    }
}
