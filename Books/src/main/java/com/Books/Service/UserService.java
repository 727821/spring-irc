package com.Books.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Entity.UserDetails;
import com.Books.Repository.UserRepository;




	@Service
	public class UserService {
		@Autowired
		UserRepository urepo;
		
		public List<UserDetails> getUserDetail()
		{
			return urepo.findAll();
		}

		public UserDetails saveuserDetails(UserDetails u)
		{
			return urepo.save(u);
		}
		
	}
