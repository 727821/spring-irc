package com.book.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.data.Model.TopBooks;

public interface bookRepo extends JpaRepository<TopBooks, Integer> {

}
