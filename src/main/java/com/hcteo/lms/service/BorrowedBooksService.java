/**
 * Service class for managing borrowed books in the LMS application.
 * Provides methods for creating borrow records, returning and renewing books,
 * paying penalties, and checking book/user availability and quotas.
 *
 * <p>
 * Core responsibilities include:</p>
 * <ul>
 * <li>Creating new borrow records with business rule checks (availability,
 * quota, overdue, penalty).</li>
 * <li>Fetching borrow records by user, book, or ID.</li>
 * <li>Handling book returns, including overdue and penalty calculation.</li>
 * <li>Renewing borrowed books and updating relevant fields.</li>
 * <li>Processing penalty payments for overdue books.</li>
 * <li>Checking book availability and user quota for borrowing.</li>
 * </ul>
 *
 * <p>
 * Relies on {@link BorrowedBooksRepository} for data access and custom
 * queries.</p>
 */
package com.hcteo.lms.service;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcteo.lms.model.BorrowedBooks;
import com.hcteo.lms.repository.BorrowedBooksRepository;

@Service
public class BorrowedBooksService {

    @Autowired
    private BorrowedBooksRepository borrowedBooksRepository;

    // create
    public BorrowedBooks createBorrowedBooks(BorrowedBooks borrowedBooks) {
        Long available = getAvailable(borrowedBooks.getBook_id());
        Long quota = getQuota(borrowedBooks.getUser_id());
        Long overdue = borrowedBooksRepository.getOverdue(borrowedBooks.getUser_id());
        Long exceeded = borrowedBooksRepository.getExceedPenelty(borrowedBooks.getUser_id());

        if (available > 0 && quota > 0 && overdue == 0 && exceeded == 0) {
            return borrowedBooksRepository.saveAndFlush(borrowedBooks);
        } else {
            borrowedBooks.setUser_id((long) 0);
            borrowedBooks.setBook_id((long) 0);
            return borrowedBooks;
        }
    }

    // get borrow record
    public BorrowedBooks getBorrowRecord(Long user_id, Long book_id) {
        return borrowedBooksRepository.getBorrowRecord(user_id, book_id);
    }

    // get borrow record by ID
    public Optional<BorrowedBooks> getById(Long id) {
        return borrowedBooksRepository.findById(id);
    }

    // get borrow record
    public BorrowedBooks getRenewableRecord(Long user_id, Long book_id) {
        return borrowedBooksRepository.getRenewableRecord(user_id, book_id);
    }

    // return book
    public BorrowedBooks returnBook(Long borrow_id, BorrowedBooks returnBook) {
        BorrowedBooks book = getById(borrow_id).orElseThrow();
        if (Objects.equals(book.getBorrow_id(), borrow_id)) {
            book.setActualReturnDate(returnBook.getActualReturnDate());
            book.setOverdue(returnBook.getOverdue());
            if (returnBook.getOverdue() > 0) {
                BigDecimal penelty = borrowedBooksRepository.penelty(returnBook.getOverdue());
                book.setPenelty(penelty);
            }
            return borrowedBooksRepository.save(book);
        }
        return book;
    }

    // renew book
    public BorrowedBooks renewBook(Long borrow_id, BorrowedBooks renewBook) {
        BorrowedBooks book = getById(borrow_id).orElseThrow();
        if (Objects.equals(book.getBorrow_id(), borrow_id)) {
            book.setReturnDate(renewBook.getReturnDate());
            book.setRenewed(renewBook.getRenewed());
            return borrowedBooksRepository.save(book);
        }
        return book;
    }

    // pay penelty
    public BorrowedBooks payPenelty(Long borrow_id) {
        BorrowedBooks book = getById(borrow_id).orElseThrow();
        if (Objects.equals(book.getBorrow_id(), borrow_id)) {
            book.setPeneltyPaid(book.getPenelty());
            return borrowedBooksRepository.save(book);
        }
        return book;
    }

    // get availability
    public Long getAvailable(Long book_id) {
        return borrowedBooksRepository.getAvailability(book_id);
    }

    // get quota
    public Long getQuota(Long user_id) {
        return borrowedBooksRepository.getQuotaAvailability(user_id);
    }

}
