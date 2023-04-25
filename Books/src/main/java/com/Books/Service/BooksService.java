package com.Books.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Entity.Books;
import com.Books.Repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	public BooksRepository repobj;

	public Books saveInfo(Books obj2) {

		return repobj.save(obj2);
	}

	public List<Books> GetInfo() {
		
		return repobj.findAll();
	}

	public Books UpdateInfo(Books obj3) {
		
		return repobj.saveAndFlush(obj3);
	}

	public String deleteInfo(int id) {
		repobj.deleteById(id);
		return "Deleted Successfully";
	}
	
	
	
	

}
