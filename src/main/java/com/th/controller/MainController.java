package com.th.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.th.constants.PropertyConstant;

/**
 * Controls all the web pages request sent from the user's machine
 * @author Rohith S
 *
 */
@Controller
public class MainController {
	
	@RequestMapping(value = PropertyConstant.DEFAULT)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = PropertyConstant.USER_LOGIN)
	public String userlogin() {
		return "userlogin";
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
	@RequestMapping(value = PropertyConstant.USER_REGISTER)
	public String register() {
	      return "register";
	}
	
   
	

   
   
}
