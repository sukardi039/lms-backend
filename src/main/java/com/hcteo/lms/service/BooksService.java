/**
 * Service class for managing Books in the LMS application.
 * Provides methods for creating, retrieving, updating, and deleting books,
 * as well as various queries related to book borrowing, overdue, outstanding, and renewal status.
 */
package com.hcteo.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcteo.lms.model.Books;
import com.hcteo.lms.repository.BooksRepository;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    // create book
    public Books createBooks(Books book) {
        return booksRepository.saveAndFlush(book);
    }

    // list all books
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    // get book by ID
    public Optional<Books> getBookById(Long id) {
        return booksRepository.findById(id);
    }

    // update
    public Books updateBook(Long id, Books book) {
        Books originalBook = booksRepository.findById(id).orElseThrow();
        originalBook.setIsbn(book.getIsbn());
        originalBook.setTitle(book.getTitle());
        originalBook.setAuthor(book.getAuthor());
        originalBook.setCategory(book.getCategory());
        originalBook.setBookImage(book.getBookImage());
        originalBook.setPublishedYear(book.getPublishedYear());
        originalBook.setCopyInStock(book.getCopyInStock());
        return booksRepository.save(originalBook);
    }

    // delete by id
    public void deleteBook(Long id) {
        booksRepository.deleteById(id);
    }

    // get category
    public List<String> getCategory() {
        return booksRepository.getCategoryList();
    }

    // borrowed by user
    public List<Books> borrowedBooksByUser(Long id) {
        return booksRepository.borrowedBooksByUser(id);
    }

    // overdue by user
    public List<Books> overdueByUser(Long id) {
        return booksRepository.overdueBooksByUser(id);
    }

    // outstanding by user
    public List<Books> outstandingByUser(Long id) {
        return booksRepository.outstandingByUser(id);
    }

    // all outstanding
    public List<Books> allOutstanding() {
        return booksRepository.allOutstanding();
    }

    // renew by user
    public List<Books> renewByUser(Long id) {
        return booksRepository.renewBooksByUser(id);
    }
}
