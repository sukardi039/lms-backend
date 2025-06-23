/**
 * Controller for managing borrowed books operations in the LMS system.
 * Provides endpoints for creating, returning, renewing, and paying penalties for borrowed books,
 * as well as retrieving borrow records and renewable records.
 *
 * Endpoints:
 * <ul>
 * <li>POST /api/borrowedbooks - Create a new borrowed book record.</li>
 * <li>PUT /api/borrowedbooks/return/{id} - Return a borrowed book.</li>
 * <li>PUT /api/borrowedbooks/renew/{id} - Renew a borrowed book.</li>
 * <li>PUT /api/borrowedbooks/pay/{id} - Pay penalty for a borrowed book.</li>
 * <li>GET /api/borrowedbooks/{id}/{bd} - Get a specific borrow record.</li>
 * <li>GET /api/borrowedbooks/renewable/{id}/{bd} - Get a renewable borrow
 * record.</li>
 * </ul>
 *
 * Cross-origin requests are allowed from any origin.
 *
 * @author
 */
package com.hcteo.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    @PutMapping("/return/{id}")
    public BorrowedBooks returnBook(@PathVariable Long id, @RequestBody BorrowedBooks rt) {
        return borrowedBooksService.returnBook(id, rt);
    }

    // renew book
    @PutMapping("/renew/{id}")
    public BorrowedBooks renewBook(@PathVariable Long id, @RequestBody BorrowedBooks rt) {
        return borrowedBooksService.renewBook(id, rt);
    }

    // pay penelty
    @PutMapping("/pay/{id}")
    public BorrowedBooks payPenelty(@PathVariable Long id) {
        return borrowedBooksService.payPenelty(id);
    }

    // get record
    @GetMapping("/{id}/{bd}")
    public BorrowedBooks getBorrowRecord(@PathVariable Long id, @PathVariable Long bd) {
        return borrowedBooksService.getBorrowRecord(id, bd);
    }

    // get renewable
    @GetMapping("/renewable/{id}/{bd}")
    public BorrowedBooks getRenewableRecord(@PathVariable Long id, @PathVariable Long bd) {
        return borrowedBooksService.getRenewableRecord(id, bd);
    }
}
