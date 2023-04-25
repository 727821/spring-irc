package com.book.data.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.data.Model.TopBooks;
import com.book.data.Repository.bookRepo;


@Service
public class bookservice {
	
	@Autowired
	public bookRepo brepo;
	
	public TopBooks saveInfo(TopBooks tb)
	{
		return brepo.save(tb);
	}
	public List<TopBooks>getInfo()
	{
		return brepo.findAll();
	}
	public TopBooks updateInfo(TopBooks bt)
	{
		return brepo.saveAndFlush(bt);
	}
	public void deleteInfo(int id)
	{
		brepo.deleteById(id);
	
	}
}
