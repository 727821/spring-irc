package com.nithya.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectApplication.class, args);
	}

}


repository---->

p
package com.book.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.data.bookModel.bookModel;

public interface bookrepository extends JpaRepository<bookModel, Integer> {

}



service--->

package com.book.data.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.data.Repository.bookrepository;
import com.book.data.bookModel.bookModel;


@Service
public class bookservice {
	@Autowired
	public bookrepository bookrepo;
	
	public bookModel saveInfo(bookModel bm)
	{
        return bookrepo.save(bm);
	}
	public List<bookModel>getInfo()
	{
		return bookrepo.findAll();
	}
	public bookModel updateInfo(bookModel bu)
	{
		return bookrepo.saveAndFlush(bu);
	}
	public void deleteInfo(int id)
	{
		bookrepo.deleteById(id);

	}

}



controller--->


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

import com.book.data.Service.bookservice;
import com.book.data.bookModel.bookModel;


@RestController
public class bookController {
	
	@Autowired
	public bookservice bser;
	
	@PostMapping("/saveBook")
	public bookModel addDetails(@RequestBody bookModel ba)
	{
		return bser.saveInfo(ba);
	}

	@GetMapping("/getBook")
	public List<bookModel> getDetails()
	{
		return bser.getInfo();
	}
	
	@PutMapping("/updateBook")
	public bookModel updateDetails(@RequestBody bookModel bb)
	{
		return bser.updateInfo(bb);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		bser.deleteInfo(id);
		return "bookid" +id+"deleted";
	}
	
}















