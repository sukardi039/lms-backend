package com.hcteo.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcteo.lms.model.Books;
import com.hcteo.lms.service.BooksService;

/**
 * REST controller for managing books in the library management system. Provides
 * endpoints for CRUD operations, category retrieval, and user-specific book
 * queries.
 *
 * Endpoints:
 * <ul>
 * <li>POST /api/books - Create a new book</li>
 * <li>GET /api/books - Retrieve all books</li>
 * <li>GET /api/books/{id} - Retrieve a book by its ID</li>
 * <li>PUT /api/books/{id} - Update a book by its ID</li>
 * <li>DELETE /api/books/{id} - Delete a book by its ID</li>
 * <li>GET /api/books/category - Retrieve all book categories</li>
 * <li>GET /api/books/borrowed/{id} - Retrieve books borrowed by a specific
 * user</li>
 * <li>GET /api/books/overdue/{id} - Retrieve overdue books for a specific
 * user</li>
 * <li>GET /api/books/outstanding/{id} - Retrieve outstanding books for a
 * specific user</li>
 * <li>GET /api/books/outstanding - Retrieve all outstanding books</li>
 * <li>GET /api/books/renew/{id} - Retrieve books eligible for renewal by a
 * specific user</li>
 * </ul>
 *
 * Cross-origin requests are allowed from any origin.
 *
 * @author [Your Name]
 */
@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BooksController {

    @Autowired
    private BooksService booksService;

    // create
    @PostMapping
    public Books createBook(@RequestBody Books book) {
        return booksService.createBooks(book);
    }

    // get all books
    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    // get book by id
    @GetMapping("/{id}")
    public ResponseEntity<Books> getBookById(@PathVariable Long id) {
        Books book = booksService.getBookById(id).orElseThrow();
        return ResponseEntity.ok(book);
    }

    // update
    @PutMapping("/{id}")
    public Books updateBook(@PathVariable Long id, @RequestBody Books book) {
        return booksService.updateBook(id, book);
    }

    // delete
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        booksService.deleteBook(id);
    }

    @GetMapping("/category")
    public List<String> getCategory() {
        return booksService.getCategory();
    }

    @GetMapping("/borrowed/{id}")
    public List<Books> borrowedByUser(@PathVariable Long id) {
        return booksService.borrowedBooksByUser(id);
    }

    @GetMapping("/overdue/{id}")
    public List<Books> overdueByUser(@PathVariable Long id) {
        return booksService.overdueByUser(id);
    }

    @GetMapping("/outstanding/{id}")
    public List<Books> outstandingByUser(@PathVariable Long id) {
        return booksService.outstandingByUser(id);
    }

    @GetMapping("/outstanding")
    public List<Books> allOutstanding() {
        return booksService.allOutstanding();
    }

    @GetMapping("/renew/{id}")
    public List<Books> renewByUser(@PathVariable Long id) {
        return booksService.renewByUser(id);
    }
}
