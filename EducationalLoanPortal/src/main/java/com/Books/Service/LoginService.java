package com.Books.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Models.LoginModel;
import com.Books.Repository.LoginRepo;

import jakarta.persistence.GeneratedValue;

@Service
public class LoginService {
	
 @Autowired
 @GeneratedValue
 LoginRepo lmrepo;
 
 public LoginModel saveLogin(LoginModel lm)
 {
	 return lmrepo.save(lm);
 }
 
 public String validateUser(String email, String password)
 {
	 String result="";
	 LoginModel lm=lmrepo.findByEmail(email);
	 if(lm==null)
	 {
		 result="no user found";
	 }
	 else
	 {
		 if(lm.getPassword().equals(password))
   {
	result="Login successfull";
    }
		 else
		 {
			 result="login failed";
		 }
	 }
	 return result;
 }

}
