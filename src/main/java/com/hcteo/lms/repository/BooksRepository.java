package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcteo.lms.model.Books;

public interface BooksRepository extends JpaRepository<Books, String> {

}
