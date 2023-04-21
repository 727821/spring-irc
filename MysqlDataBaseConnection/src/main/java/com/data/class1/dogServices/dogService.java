package com.data.class1.dogServices;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.class1.DogBreeds.Breeds;
import com.data.class1.dogRepository.dogrepo;

public class dogService {
	
	@Autowired
	public dogrepo drepo;
	
	public Breeds saveInfo(Breeds b)
	{
		return drepo.save(b);
	}
	

}
