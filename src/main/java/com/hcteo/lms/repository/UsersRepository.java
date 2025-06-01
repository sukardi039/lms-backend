package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcteo.lms.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
