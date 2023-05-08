package com.Books.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Entity.UserDetails;
import com.Books.Service.UserService;


@RestController
public class UserController {
		@Autowired
		UserService user;
	    
	    @GetMapping("/getuser")
	    public List<UserDetails> getUserDetail()
	    {
	    	return user.getUserDetail();
	    }
	
      @PostMapping("/saveuser")
     public UserDetails saveuserDetails(@RequestBody UserDetails u)
	{
		return user.saveuserDetails(u);
	}
	
	
	}
