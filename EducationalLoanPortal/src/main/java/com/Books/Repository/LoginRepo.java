package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Models.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	
LoginModel  findByEmail(String email);
	
}
