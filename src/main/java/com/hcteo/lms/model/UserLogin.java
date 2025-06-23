/**
 * Entity representing a user login record.
 * Stores information about each login event, including the login ID,
 * associated user ID, and the time of login.
 *
 * Fields:
 * <ul>
 * <li>login_id - Unique identifier for the login event (primary key).</li>
 * <li>user_id - Identifier of the user who logged in.</li>
 * <li>timeLogin - Timestamp of when the login occurred.</li>
 * </ul>
 *
 * Uses Lombok annotations for boilerplate code generation.
 */
package com.hcteo.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long login_id;
    private Long user_id;
    private String timeLogin;
}
