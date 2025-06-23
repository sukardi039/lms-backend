/**
 * Repository interface for managing BorrowedBooks entities and related queries.
 * Provides custom native SQL queries for book borrowing, returning, availability, penalties, and renewals.
 *
 * Methods:
 * <ul>
 * <li>{@link #returnBook(Long, Long, String)}: Updates the actual return date
 * for a borrowed book by a user.</li>
 * <li>{@link #getBorrowRecord(Long, Long)}: Retrieves the current borrow record
 * for a user and book where the book has not yet been returned.</li>
 * <li>{@link #getAvailability(Long)}: Gets the availability count for a
 * specific book.</li>
 * <li>{@link #getQuotaAvailability(Long)}: Gets the quota availability for a
 * specific user.</li>
 * <li>{@link #penelty(Long)}: Calculates the penalty for overdue books based on
 * the number of days, with a maximum cap.</li>
 * <li>{@link #getOverdue(Long)}: Retrieves the overdue status for a user.</li>
 * <li>{@link #getExceedPenelty(Long)}: Checks if a user has exceeded the
 * penalty limit.</li>
 * <li>{@link #getRenewableRecord(Long, Long)}: Retrieves a borrow record
 * eligible for renewal for a user and book.</li>
 * </ul>
 */
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

    @Query(value = "select least(?1 * (select value_decimal from param WHERE param_key = 'PENELTY_PER_DAY'), (select value_decimal from param where param_key = 'MAX_PENELTY_PER_BOOK'))", nativeQuery = true)
    BigDecimal penelty(Long days);

    @Query(value = "select overdue from user_overdue WHERE user_id = ?1", nativeQuery = true)
    Long getOverdue(Long user_id);

    @Query(value = "select exceeded from user_exceed_penelty WHERE user_id = ?1", nativeQuery = true)
    Long getExceedPenelty(Long user_id);

    @Query(value = "select * from borrowed_books WHERE book_id = ?2 and user_id = ?1 and actual_return_date is null and return_date > now() and renewed < (select value_long from param where param_key = 'MAX_RENEWAL') limit 1", nativeQuery = true)
    BorrowedBooks getRenewableRecord(Long user_id, Long book_id);
}
