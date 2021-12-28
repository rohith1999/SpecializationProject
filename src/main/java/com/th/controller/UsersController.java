package com.th.controller;

import java.util.List;

import java.util.Optional;

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
import com.th.constants.PropertyConstant;
import com.th.model.Book;
import com.th.model.User;
import com.th.repository.UsersRepository;
import com.th.services.UserService;

/**
 * UsersController class allows you to authenticate and register a user
 * 
 * @author Rohith S
 *
 */
@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	UserService userService;

	/**
	 * auth matches user password with encrypted password in database
	 * 
	 * @param user with properties useremail and password
	 * @return String which redirects to home page or back to login page
	 */
	@RequestMapping(value = PropertyConstant.AUTH_USER, method = RequestMethod.POST)
	public String authenticationUser(User user) {

		return userService.findByUserEmail(user);

	}

	/**
	 * Register creates a new user for the application
	 * 
	 * @param userRegister has all the properties required to create a new user
	 * @return String returns to home page if new user is created else goes to login
	 *         page
	 */
	@RequestMapping(value = PropertyConstant.REGISTER_USER, method = RequestMethod.POST)
	public String register(User userRegister) {

		return userService.registerUser(userRegister);

	}

}
