package com.hcteo.lms.repository;

import java.math.BigDecimal;

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

    @Query(value = "select available from books_availability WHERE book_id = ?1", nativeQuery = true)
    Long getAvailability(Long book_id);

    @Query(value = "select available from quota_availability WHERE user_id = ?1", nativeQuery = true)
    Long getQuotaAvailability(Long user_id);

    @Query(value = "select ?1 * (select value_decimal from param WHERE param_key = 'PENELTY_PER_DAY')", nativeQuery = true)
    BigDecimal penelty(Long days);

    @Query(value = "select overdue from user_overdue WHERE user_id = ?1", nativeQuery = true)
    Long getOverdue(Long user_id);

    @Query(value = "select exceeded from user_exceed_penelty WHERE user_id = ?1", nativeQuery = true)
    Long getExceedPenelty(Long user_id);

    @Query(value = "select * from borrowed_books WHERE book_id = ?2 and user_id = ?1 and actual_return_date is null and return_date > now() and renewed is null limit 1", nativeQuery = true)
    BorrowedBooks getRenewableRecord(Long user_id, Long book_id);
}
