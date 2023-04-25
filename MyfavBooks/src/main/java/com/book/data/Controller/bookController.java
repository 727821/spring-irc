package com.book.data.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.data.Model.TopBooks;
import com.book.data.Service.bookservice;


@RestController
public class bookController {
	
	@Autowired
	public bookservice bser;
	
	@PostMapping("/saveBooks")
	public TopBooks addDetails(@RequestBody TopBooks ta)
	{
		return bser.saveInfo(ta);
	}
	@GetMapping("/getbooks")
	public List<TopBooks> getDetails()
	{
		return bser.getInfo();
	}
	@PutMapping("/updatebooks")
	public TopBooks updaateDetails(@RequestBody TopBooks id)
	{
		return bser.updateInfo(id);
	}
	@DeleteMapping("/deletebooks/{bid}")
	public String deleteDetails(@PathVariable int bookid)
	{
		return "Bookid "+ bookid +" Deleted";
	}
	
	
	
}