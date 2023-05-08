package com.Books.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Models.AdminModel;
import com.Books.Models.LoanApplicationModel;
import com.Books.Models.UserModel;
import com.Books.Repository.AdminRepo;
import com.Books.Repository.LoanApplicationRepo;
import com.Books.Repository.UserRepo;

@Service
public class EducationalLoanPortalService {
	//UserModel
	@Autowired
	UserRepo urepo;
	
	public UserModel saveDetail(UserModel u)
	{
		return urepo.save(u);
	}
     public List<UserModel> getDetail()
	{
		return urepo.findAll();
	}
     
     public UserModel updateInfo(UserModel um)
     {
    	 return urepo.saveAndFlush(um);
     }
	
	//LoanApplicationModel
	@Autowired
	LoanApplicationRepo lrepo;
	public LoanApplicationModel saveInfo(LoanApplicationModel l)
	{
		return lrepo.save(l);
	}
	public List<LoanApplicationModel> getinfo()
	{
		return lrepo.findAll();
	}
	
	public LoanApplicationModel updateInfo(LoanApplicationModel ln)
	{
		return lrepo.saveAndFlush(ln);
	}
	//AdminModel
	@Autowired
	AdminRepo arepo;
	
	public AdminModel saveData(AdminModel a)
	{
		return arepo.save(a);
	
	}
	public List<AdminModel> getdata()
	{
		return arepo.findAll();
	}
	public AdminModel updateInfo(AdminModel am)
	{
		return arepo.saveAndFlush(am);
	}
}
	
