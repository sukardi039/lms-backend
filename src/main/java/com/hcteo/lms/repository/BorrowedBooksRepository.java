package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcteo.lms.model.BorrowedBooks;

@Repository
public interface BorrowedBooksRepository extends JpaRepository<BorrowedBooks, Long> {

}
