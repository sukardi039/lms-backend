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
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String name;
    private String address;
    private String mobileNumber;
    private String emailAddress;
    private String role;
    private Long status;
}