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
public class BorrowedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrow_id;
    private String book_id;
    private Long user_id;
    private String borrowedDate;
    private String returnDate;
    private String actualReturnDate;
    private String status;
    private Long batch_id;
}
