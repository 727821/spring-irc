package com.Books.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Entity.LoginUser;
import com.Books.Service.LoginService;



@RestController
public class LoginController {

@Autowired
  LoginService logser;
@PostMapping("/checkLogin")
	public String validateUser(@RequestBody LoginUser l)
	{
	System.out.println(l.getUsername());
		return logser.validateUser(l.getUsername(),l.getPassword());
	}
@PostMapping("/addLogin")
public  LoginUser Login(@RequestBody LoginUser l)
{
return logser.saveLogin(l);
}
}

