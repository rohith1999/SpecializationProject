package com.th.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controls all the web pages request sent from the user's machine
 * @author Rohith S
 *
 */
@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/userlogin")
	public String adminlogin() {
		return "userlogin";
	}
	
	
   
	/**
	 * login returns webpage 
	 * @return String which maps to login HTML file in templates directory
	 */
	@RequestMapping(value = "/login")
   public String login() {
      return "login";
   }
	
	
	/**
	 * home returns webpage
	 * @return String which maps to home HTML file in templates directory
	 */
	@RequestMapping(value = "/home")
	public String home() {
	      return "home";
	}
	
	/**
	 * register returns webpage
	 * @return String which maps to register HTML file in templates directory
	 */
	@RequestMapping(value = "/register")
	public String register() {
	      return "register";
	}
	
   
	

   
   
}
