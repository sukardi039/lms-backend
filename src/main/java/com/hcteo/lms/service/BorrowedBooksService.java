package com.hcteo.lms.service;

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

}
