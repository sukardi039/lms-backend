/**
 * The entry point for the Learning Management System (LMS) Spring Boot application.
 * <p>
 * This class bootstraps the application using {@link SpringApplication}.
 * </p>
 */
package com.hcteo.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);
    }

}
