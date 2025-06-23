/**
 * Entity representing a record of a borrowed book in the library management system.
 * Stores information about the borrowing transaction, including the book, user,
 * borrowing and return dates, renewal status, overdue status, and penalties.
 *
 * Fields:
 * <ul>
 * <li>borrow_id - Unique identifier for the borrowing record.</li>
 * <li>book_id - Identifier of the borrowed book.</li>
 * <li>user_id - Identifier of the user who borrowed the book.</li>
 * <li>borrowedDate - Date when the book was borrowed.</li>
 * <li>returnDate - Expected return date for the borrowed book.</li>
 * <li>actualReturnDate - Actual date when the book was returned.</li>
 * <li>renewed - Number of times the borrowing has been renewed.</li>
 * <li>status - Current status of the borrowing (e.g., borrowed, returned,
 * overdue).</li>
 * <li>batch_id - Identifier for the batch or group of borrowed books (if
 * applicable).</li>
 * <li>overdue - Indicates if the book is overdue (e.g., 1 for overdue, 0 for
 * not overdue).</li>
 * <li>Penelty - Penalty amount for overdue returns.</li>
 * <li>PeneltyPaid - Amount of penalty paid by the user.</li>
 * </ul>
 */
package com.hcteo.lms.model;

import java.math.BigDecimal;

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
public class BorrowedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrow_id;
    private Long book_id;
    private Long user_id;
    private String borrowedDate;
    private String returnDate;
    private String actualReturnDate;
    private Long renewed;
    private String status;
    private Long batch_id;
    private Long overdue;
    private BigDecimal Penelty;
    private BigDecimal PeneltyPaid;

}
