package com.hcteo.lms.service;

import java.math.BigDecimal;
import java.util.Objects;

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

    // return book
    public BorrowedBooks returnBook(Long user_id, Long book_id, BorrowedBooks returnBook) {
        BorrowedBooks book = getBorrowRecord(user_id, book_id);
        if (Objects.equals(book.getUser_id(), user_id) && Objects.equals(book.getBook_id(), book_id)) {
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

    // get availability
    public Long getAvailable(Long book_id) {
        return borrowedBooksRepository.getAvailability(book_id);
    }

    // get quota
    public Long getQuota(Long user_id) {
        return borrowedBooksRepository.getQuotaAvailability(user_id);
    }

}
