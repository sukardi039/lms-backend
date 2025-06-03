package com.hcteo.lms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value = "SELECT * FROM users WHERE email_address = ?1 and password = ?2", nativeQuery = true)
    Users findUserByEmailPassword(String email, String password);

}
