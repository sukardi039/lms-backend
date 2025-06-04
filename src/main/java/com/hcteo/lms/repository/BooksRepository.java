package com.hcteo.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

    @Query(value = "SELECT * FROM books_category", nativeQuery = true)
    List<String> getCategoryList();
}
