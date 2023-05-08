package com.Books.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Models.AdminModel;
import com.Books.Models.LoanApplicationModel;
import com.Books.Models.UserModel;
import com.Books.Service.EducationalLoanPortalService;

@RestController
public class EducationalLoanPortalController {
	//UserModel
	@Autowired
	EducationalLoanPortalService eser;
	@PostMapping("/postusermodel")
	public UserModel  savedetail(@RequestBody UserModel um)
	{
		return eser.saveDetail(um);
	}
	
	@GetMapping("/getusermodel")
	public List<UserModel> getDetail()
	{
		return eser.getDetail();
	}
	
	@PutMapping("/putusermodel")
    public UserModel updatedetails(@RequestBody UserModel un)
    {
		return eser.updateInfo(un);
    }
    
    
	//LoanApplicationModel
	@PostMapping("/postloanapplicationmodel")
	public LoanApplicationModel saveInfo(@RequestBody LoanApplicationModel ln)
	{
		return eser.saveInfo(ln);
	}
	@GetMapping("/getloanapplicationmodel")
	public List<LoanApplicationModel> getlogin()
	{
		return eser.getinfo();
	}
	
	@PutMapping("/putloanapplicationmodel")
	public LoanApplicationModel updateInfo(@RequestBody LoanApplicationModel lm)
	{
		return eser.updateInfo(lm);
	}
	//AdminModel
	@PostMapping("/postadminmodel")
	public AdminModel save(@RequestBody AdminModel am)
	{
		return eser.saveData(am);
	}
	@GetMapping("/getadminmodel")
	public List<AdminModel> get()
	{
		return eser.getdata();
	}
	
	@PutMapping("/putusermodel")
	
	public AdminModel update(@RequestBody AdminModel an)
	{
		return eser.updateInfo(an);
	}
}
