package com.th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.th.constants.PropertyConstant;
import com.th.model.PasswordUpdate;
import com.th.model.User;
import com.th.services.UserService;

/**
 * UserController class allows you to authenticate and register a user
 * 
 * @author Rohith S
 *
 */
@Controller
public class UserController {

	/**
	 * userSerivce (autowires all user functionalitites to cart controller)
	 */
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

		return userService.findByUserEmail(user, model);

	}

	/**
	 * Register creates a new user for the application
	 * 
	 * @param userRegister has all the properties required to create a new user
	 * @return String returns to home page if new user is created else goes to login
	 *         page
	 */
	@RequestMapping(value = PropertyConstant.USER_REGISTER, method = RequestMethod.POST)
	public ModelAndView register(User userRegister, Model model) {

		return userService.registerUser(userRegister, model);

	}

	/**
	 * Allows an existing logged-in user to update his password
	 * 
	 * @param passwordUpdate consists of oldpassword,newpassword and useremailo
	 * @return String returns index or success page
	 */
	@RequestMapping(value = PropertyConstant.USER_PASS_CHANGE, method = RequestMethod.POST)
	public String passwordChange(PasswordUpdate passwordUpdate) {

		return userService.passwordChange(passwordUpdate);

	}

}
