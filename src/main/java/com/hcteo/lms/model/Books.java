/**
 * Represents a book entity in the library management system.
 * <p>
 * This class is mapped to a database table using JPA annotations. It contains
 * information about a book such as its ISBN, title, author, category, image,
 * publication year, and the number of copies in stock.
 * </p>
 *
 * Fields:
 * <ul>
 * <li>book_id - Unique identifier for the book (primary key).</li>
 * <li>isbn - International Standard Book Number.</li>
 * <li>title - Title of the book.</li>
 * <li>author - Author of the book.</li>
 * <li>category - Category or genre of the book.</li>
 * <li>bookImage - URL or path to the book's image.</li>
 * <li>publishedYear - Year the book was published.</li>
 * <li>copyInStock - Number of copies available in stock.</li>
 * <li>anything - Additional information or notes about the book.</li>
 * </ul>
 *
 * Lombok annotations are used to generate getters, setters, constructors, and
 * other boilerplate code.
 */
package com.hcteo.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private String bookImage;
    private int publishedYear;
    private int copyInStock;
    private String anything;
}
