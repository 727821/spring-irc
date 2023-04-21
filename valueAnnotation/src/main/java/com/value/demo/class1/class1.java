package com.value.demo.class1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class class1 {
 
	public String name="Nithya";
	
	@GetMapping("/getName")
	public String getName()
	{
		return "Welcome "+name; 
	}

}
