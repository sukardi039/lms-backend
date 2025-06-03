package com.hcteo.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

    @Query(value = "SELECT * FROM user_login WHERE user_id = ?1 order by login_time desc", nativeQuery = true)
    List<UserLogin> findByUserId(Long userId);

    @Query(value = "insert into user_login (time_login, user_id) values (now(), ?1)", nativeQuery = true)
    UserLogin keepLogin(Long userId);
}
