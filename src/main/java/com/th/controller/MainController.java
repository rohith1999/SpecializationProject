package com.th.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   
	//return login page
	@RequestMapping(value = "/login")
   public String login() {
      return "login";
   }
	
	@RequestMapping(value = "/home")
	public String home() {
	      return "home";
	}
	
	
	@RequestMapping(value = "/register")
	public String register() {
	      return "register";
	}
	
   
	

   
   
}
