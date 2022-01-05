package com.th.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.th.constants.PropertyConstant;
import com.th.model.Book;
import com.th.model.PasswordUpdate;
import com.th.model.User;
import com.th.repository.UsersRepository;
import com.th.services.UserService;
import com.th.util.ImageUtil;

/**
 * UsersController class allows you to authenticate and register a user
 * 
 * @author Rohith S
 *
 */
@Controller
public class UsersController {

	@Autowired
	UserService userService;

	/**
	 * auth matches user password with encrypted password in database
	 * 
	 * @param user with properties useremail and password
	 * @return String which redirects to home page or back to login page
	 */
	@RequestMapping(value = PropertyConstant.USER_LOGIN, method = RequestMethod.POST)
	public ModelAndView authenticationUser(User user, Model model) {

		

		return userService.findByUserEmail(user,model);

	}

	/**
	 * Register creates a new user for the application
	 * 
	 * @param userRegister has all the properties required to create a new user
	 * @return String returns to home page if new user is created else goes to login
	 *         page
	 */
	@RequestMapping(value = PropertyConstant.USER_REGISTER, method = RequestMethod.POST)
	public String register(@RequestParam("User") User userRegister) {

		return userService.registerUser(userRegister);

	}
	
	
	@RequestMapping(value = PropertyConstant.USER_PASS_CHANGE, method = RequestMethod.POST)
	public String passwordChange(PasswordUpdate passwordUpdate) {

		return userService.passwordChange(passwordUpdate);

	}

}
