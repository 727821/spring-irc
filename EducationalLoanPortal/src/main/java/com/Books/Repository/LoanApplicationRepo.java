package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Models.LoanApplicationModel;


public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
