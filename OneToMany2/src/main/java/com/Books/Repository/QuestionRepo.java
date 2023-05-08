package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
