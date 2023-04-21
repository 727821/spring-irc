package com.value.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class value {
	@Value("${carname}")
	public String car;
	@GetMapping("/carss")
	@ResponseBody
	public String displayCar()
	{
		return "my fav car is "+ car;
	}
	

}
