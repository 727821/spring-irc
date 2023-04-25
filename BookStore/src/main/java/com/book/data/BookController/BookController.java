package com.book.data.BookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.data.BookModel.BookModel;
import com.book.data.BookService.BookService;


@RestController
public class BookController {

	@Autowired
	public BookService bser;
	
	@PostMapping("/save")
	public BookModel addDetails(@RequestBody BookModel ba)
	{
		return bser.saveInfo(ba);
	}
	@GetMapping("/getBook")
	public List<BookModel> getDetails()
	{
		return bser.getInfo();
	}
	@PutMapping("/updateBook")
	public BookModel updateDetails(@RequestBody BookModel bb)
	{
		return bser.updateInfo(bb);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		bser.deleteInfo(id);
		return "bookid "+id+"deleted";
	}
	
}
