/**
 * Represents a user entity in the LMS system.
 * <p>
 * This class is mapped to a database table using JPA annotations. It contains
 * user-related information such as name, password, contact details, role, and
 * status.
 * </p>
 *
 * Fields:
 * <ul>
 * <li>user_id - Unique identifier for the user (primary key).</li>
 * <li>name - Name of the user.</li>
 * <li>password - User's password (should be stored securely).</li>
 * <li>address - Physical address of the user.</li>
 * <li>mobileNumber - User's mobile phone number.</li>
 * <li>emailAddress - User's email address.</li>
 * <li>role - Role assigned to the user (e.g., admin, student, instructor).</li>
 * <li>status - Status of the user (e.g., active, inactive).</li>
 * </ul>
 *
 * Lombok annotations are used to generate boilerplate code such as getters,
 * setters, constructors.
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
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String name;
    private String password;
    private String address;
    private String mobileNumber;
    private String emailAddress;
    private String role;
    private Long status;
}
