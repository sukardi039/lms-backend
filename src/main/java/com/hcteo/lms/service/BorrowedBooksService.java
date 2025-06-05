package com.hcteo.lms.service;

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
        return borrowedBooksRepository.saveAndFlush(borrowedBooks);
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
            return borrowedBooksRepository.save(book);
        }
        return book;
    }
}
