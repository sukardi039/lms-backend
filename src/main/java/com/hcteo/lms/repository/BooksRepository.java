/**
 * Repository interface for managing {@link com.hcteo.lms.model.Books} entities.
 * Provides custom queries for retrieving book categories, borrowed books,
 * overdue books, outstanding penalties, and renewable books for users.
 *
 * Methods:
 * <ul>
 * <li>{@link #getCategoryList()} - Retrieves a list of all book
 * categories.</li>
 * <li>{@link #borrowedBooksByUser(Long)} - Retrieves a list of books currently
 * borrowed by a specific user.</li>
 * <li>{@link #overdueBooksByUser(Long)} - Retrieves a list of overdue books for
 * a specific user.</li>
 * <li>{@link #outstandingByUser(Long)} - Retrieves a list of books with
 * outstanding penalties for a specific user.</li>
 * <li>{@link #allOutstanding()} - Retrieves a list of all books with
 * outstanding penalties across all users.</li>
 * <li>{@link #renewBooksByUser(Long)} - Retrieves a list of books eligible for
 * renewal by a specific user.</li>
 * </ul>
 */
package com.hcteo.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcteo.lms.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

    @Query(value = "SELECT * FROM books_category", nativeQuery = true)
    List<String> getCategoryList();

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock, return_date anything FROM borrowed_books r, books b WHERE b.book_id = r.book_id and user_id = ?1 and actual_return_date is null", nativeQuery = true)
    List<Books> borrowedBooksByUser(Long user_id);

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock, return_date anything FROM borrowed_books r, books b WHERE b.book_id = r.book_id and user_id = ?1 and actual_return_date is null and return_date < now()", nativeQuery = true)
    List<Books> overdueBooksByUser(Long user_id);

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock, penelty anything FROM borrowed_books r, books b WHERE b.book_id = r.book_id and user_id = ?1 and actual_return_date is not null and penelty > 0 and penelty_paid is null", nativeQuery = true)
    List<Books> outstandingByUser(Long user_id);

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock, concat(penelty,'^',borrow_id,'^',name) anything FROM borrowed_books r, books b, users u WHERE b.book_id = r.book_id and r.user_id = u.user_id and actual_return_date is not null and penelty > 0 and penelty_paid is null", nativeQuery = true)
    List<Books> allOutstanding();

    @Query(value = "SELECT b.book_id book_id, isbn, title, author, category, book_image, published_year, copy_in_stock, return_date anything FROM borrowed_books r, books b WHERE b.book_id = r.book_id and user_id = ?1 and actual_return_date is null and return_date > now() and renewed < (select value_long from param where param_key = 'MAX_RENEWAL')", nativeQuery = true)
    List<Books> renewBooksByUser(Long user_id);

}
