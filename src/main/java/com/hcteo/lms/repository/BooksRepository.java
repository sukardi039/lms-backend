package com.hcteo.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

    @Query(value = "SELECT * FROM books_category", nativeQuery = true)
    List<String> getCategoryList();

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock FROM borrowed_books r, books b WHERE b.book_id = r.book_id and user_id = ?1 and actual_return_date is null", nativeQuery = true)
    List<Books> borrowedBooksByUser(Long user_id);
}
