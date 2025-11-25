package com.akanksha.kodewala.requestdata1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLoginPage()
	{
		System.out.println("loginController.showLoginPage()..........");
		return "loginDetails";
	}
}
