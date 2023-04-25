package com.book.data.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.data.BookModel.BookModel;
import com.book.data.BookRepository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository brepo;
	
	public BookModel saveInfo(BookModel bm)
	{
		return brepo.save(bm);
	}
	
	public List<BookModel> getInfo()
	{
		return brepo.findAll();
	}

	public BookModel updateInfo(BookModel bn)
	{
		return brepo.saveAndFlush(bn);
	}
	
	public void deleteInfo(int bid)
	{
		brepo.deleteById(bid);
	}
}
