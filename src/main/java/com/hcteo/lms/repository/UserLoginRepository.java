/**
 * Repository interface for managing {@link UserLogin} entities.
 * <p>
 * Provides methods to interact with the user_login table, including retrieving
 * login records by user ID and recording new login events.
 * </p>
 *
 * <ul>
 * <li> {@link #findByUserId(Long)}: Retrieves a list of {@link UserLogin}
 * entries for a specific user, ordered by login time in descending order.
 * </li>
 * <li> {@link #keepLogin(Long)}: Inserts a new login record for the specified
 * user with the current timestamp. <b>Note:</b> Using a modifying query with a
 * select method signature is not standard and may cause runtime issues.
 * </li>
 * </ul>
 */
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
