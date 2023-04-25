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
	
	@PostMapping("/saveBook")
	public BookModel addDetails(@RequestBody BookModel ba)
	{
		return bser.saveInfo(ba);
	}
	@GetMapping("/getBook")
	public List<BookModel> getDetails()
	{
		List<BookModel>listobj=bser.getInfo();
		return listobj;
	}
	@PutMapping("/updateBook")
	public BookModel updateDetails(@RequestBody BookModel bb)
	{
		return bser.updateInfo(bb);
	}
	@DeleteMapping("/delete/{bid}")
	public String deleteDetails(@PathVariable("bid") int bid)
	{
		bser.deleteInfo(bid);
		return "bookid "+bid+"deleted";
	}
	
}
