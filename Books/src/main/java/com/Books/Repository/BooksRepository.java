package com.Books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Books.Entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>  {

}
