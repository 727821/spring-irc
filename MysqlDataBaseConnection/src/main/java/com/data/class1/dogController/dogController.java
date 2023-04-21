package com.data.class1.dogController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.class1.DogBreeds.Breeds;
import com.data.class1.dogServices.dogService;


@RestController
public class dogController {
    @Autowired
	public dogService dogser;
	
	@PostMapping("/saveDogs")
	public Breeds addDetails(@RequestBody Breeds br)
	{
		return dogser.saveInfo(br);
	}
	
}
