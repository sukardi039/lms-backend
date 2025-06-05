package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcteo.lms.model.BorrowedBooks;

@Repository
public interface BorrowedBooksRepository extends JpaRepository<BorrowedBooks, Long> {

    @Query(value = "UPDATE borrowed_books set actual_date_return = ?3 WHERE b.book_id = ?2 and user_id = ?1", nativeQuery = true)
    Boolean returnBook(Long user_id, Long book_id, String returnDate);

    @Query(value = "select * from borrowed_books WHERE book_id = ?2 and user_id = ?1 and actual_return_date is null limit 1", nativeQuery = true)
    BorrowedBooks getBorrowRecord(Long user_id, Long book_id);
}
