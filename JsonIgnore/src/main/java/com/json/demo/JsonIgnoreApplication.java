package com.json.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonIgnoreApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JsonIgnoreApplication.class, args);
		
		Person p=new Person(1,"Nithya", 19);
		
		ObjectMapper m=new ObjectMapper();
		
		String json=m.writeValueAsString(p);
		
		System.out.println(json);
	
	}

}
