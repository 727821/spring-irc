package com.Books.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Entity.LoginUser;
import com.Books.Repository.LoginRepository;




@Service
public class LoginService {
	@Autowired
	LoginRepository logrepo;
public LoginUser saveLogin(LoginUser l)
{
    return logrepo.save(l);
}
public String validateUser(String username,String password)
{
	String result="";
	LoginUser l=logrepo.findByUsername(username);
	if(l==null)
	{
		result="Invalid user";
	}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login successfull";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}

