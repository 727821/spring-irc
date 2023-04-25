package com.book.data.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.data.BookModel.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Integer> {

}
