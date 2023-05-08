package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.Models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
