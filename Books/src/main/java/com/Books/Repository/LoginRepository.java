package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Books.Entity.LoginUser;

@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Integer> {
	
     LoginUser findByUsername(String username);

	

}

