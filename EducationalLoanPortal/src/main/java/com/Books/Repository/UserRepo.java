package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {
	
	

}
