package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
