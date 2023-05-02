package com.Books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Entity.Books;
import com.Books.Repository.BooksRepository;
import com.Books.Service.BooksService;

@RestController
public class BooksController {
	
	
	@Autowired
	public BooksService serobj;

	@PostMapping("/post")
	public Books addDetails(@RequestBody  Books obj)
	{
		return serobj.saveInfo(obj);
	}
	@GetMapping("/get")
	
		public List<Books> getDetails()
		{
			
			return serobj.GetInfo();
		}
	@PutMapping("/put")
	public Books putDetails(@RequestBody  Books obj1)
	{
		return serobj.UpdateInfo(obj1);
	}
	@DeleteMapping("/delete/{no}")
	public String DeleteDetails(@PathVariable("no") int id)
	{
		return serobj.deleteInfo(id);
	}
	
	@GetMapping("/sortdes/{bname}")
	public List<Books> sortBook(@PathVariable("bname") String bname)
	{
		return serobj.sortBook(bname);
	}
	@GetMapping("/sortasc/{aname}")
	public List<Books> sortBooks(@PathVariable("aname") String aname)
	{
		return serobj.sortBooks(aname);
	}
	
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<Books> paginationData(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize)
	{
		return serobj.paginationData(pnu, psize);
	}
	
	@GetMapping("/paginationandsortdes/{pnu}/{psize}/{bname}")
	public List<Books> paginationSorting(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize, @PathVariable String bname)
	{
		return serobj.paginationSorting(pnu, psize, bname);
	}
	
	
	
}



 
     
     
     
     
     
     
     
     