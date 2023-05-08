package com.Books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Model.Question;
import com.Books.Repository.QuestionRepo;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/question")
public class QuestionController {

	
	@Autowired
	QuestionRepo qrepo;
	@Tag(name="Post", description="Posting details")
	@PostMapping("")
	public String saveDetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Data is Saved";
	}
	@Tag(name="Get", description="Getting details")
	@GetMapping("")
	public List<Question> getDetails()
	{
		return qrepo.findAll();
	}
	
	@Tag(name="Put", description="updating details")
	@PutMapping("")
	public String updateDetails(@RequestBody Question qu)
	{
		qrepo.saveAndFlush(qu);
		return "Data Updated";
		 
	}
	@Tag(name="delete", description="Deleted details")
	@DeleteMapping("/{qno}")
	public String deleteDetails(@PathVariable int qno)
	{
		qrepo.deleteById(qno);
		return "qno "+qno+"is deleted"; 
	}
}
