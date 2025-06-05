package com.hcteo.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcteo.lms.model.BorrowedBooks;
import com.hcteo.lms.service.BorrowedBooksService;

@RestController
@RequestMapping("/api/borrowedbooks")
@CrossOrigin(origins = "*")
public class BorrowedBooksController {

    @Autowired
    BorrowedBooksService borrowedBooksService;

    // create
    @PostMapping
    public BorrowedBooks createBorrowedBooks(@RequestBody BorrowedBooks borrowedBooks) {
        return borrowedBooksService.createBorrowedBooks(borrowedBooks);
    }

    // return book
    @PutMapping("/return/{id}/{bd}")
    public BorrowedBooks returnBook(@PathVariable Long id, @PathVariable Long bd, @RequestBody BorrowedBooks rt) {
        return borrowedBooksService.returnBook(id, bd, rt);
    }
}
