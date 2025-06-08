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

    @GetMapping("/renew/{id}")
    public List<Books> renewByUser(@PathVariable Long id) {
        return booksService.renewByUser(id);
    }
}
