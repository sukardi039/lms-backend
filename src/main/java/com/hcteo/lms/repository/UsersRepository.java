/**
 * Repository interface for accessing and managing {@link Users} entities.
 * <p>
 * Extends {@link JpaRepository} to provide CRUD operations and custom queries.
 * </p>
 *
 * <p>
 * Custom Queries:
 * <ul>
 * <li> {@link #findUserByEmailPassword(String, String)} - Retrieves a user by
 * their email address and password.
 * <br>
 * Uses a native SQL query to match the provided email and password.
 * </li>
 * </ul>
 * </p>
 */
package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value = "SELECT * FROM users WHERE email_address = ?1 and password = ?2", nativeQuery = true)
    Users findUserByEmailPassword(String email, String password);

}
