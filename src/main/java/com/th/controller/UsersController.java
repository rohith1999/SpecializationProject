package com.th.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Book;
import com.th.model.Users;
import com.th.repository.UsersRepository;

@Controller
@RequestMapping("users")
public class UsersController {
	
	@Autowired
	UsersRepository jpu;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	//login an old user
	@RequestMapping(value="/auth", method=RequestMethod.POST)
	public String auth (Users u){
		Optional<Users> searchUser = jpu.findById(u.getUseremail());
		if(searchUser.isPresent()) {
			Users u1= searchUser.get();
			if(passwordEncoder.matches(u.getPassword(), u1.getPassword())) {

			     return "home";
			}else {
				return "login";
			}
			
			
			 

		}
		else
		  return "invalid";

	}
	
	
	
//	register a new user 
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register (Users u){
		Optional<Users> searchUser = jpu.findById(u.getUseremail());
		if(searchUser.isPresent()) {
			Users u1= searchUser.get();
			 
		     return "login";

		}
		else {
		   u.setPassword(passwordEncoder.encode(u.getPassword()));
		  Users saveUser = jpu.save(u);
		  return "home";	
		}

	}
	
	
	
	
	
	

}
