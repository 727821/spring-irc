package com.Books.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

	public String deleteInfo(int id) 
	{
		repobj.deleteById(id);
		return "Deleted Successfully";
	}
	@GetMapping("/sortdes/{bname}")
	public List<Books> sortBook(@PathVariable String bname)
	{
		return repobj.findAll(Sort.by(bname).descending());
	}
	@GetMapping("/sortasc/{aname}")
	public List<Books> sortBooks(@PathVariable String aname)
	{
		return repobj.findAll(Sort.by(aname).ascending());
	}

	@GetMapping("/pagination/{pnu}/{psize}")
	public List<Books> paginationData(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize)
	{
	Page<Books> p=repobj.findAll(PageRequest.of(pnu, psize));
	return p.getContent();
	}

	@GetMapping("/paginationandsortdes/{pnu}/{psize}/{bname}")
	public List<Books> paginationSorting(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize, @PathVariable String bname)
	{
		Page<Books> p=repobj.findAll(PageRequest.of(pnu, psize, Sort.by(bname).descending()));
		return p.getContent();
}
}
