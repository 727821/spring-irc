package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Books.Entity.UserDetails;



@Repository

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
