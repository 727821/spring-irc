package com.data.class1.dogRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.class1.DogBreeds.Breeds;

public interface dogrepo extends JpaRepository<Breeds, Integer> {

}
