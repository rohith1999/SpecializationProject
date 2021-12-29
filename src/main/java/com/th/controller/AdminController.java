package com.th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.th.constants.PropertyConstant;
import com.th.model.Admin;
import com.th.model.User;
import com.th.services.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	
	
	/**
	 * auth matches user password with encrypted password in database
	 * 
	 * @param user with properties useremail and password
	 * @return String which redirects to home page or back to login page
	 */
	@RequestMapping(value = PropertyConstant.AUTH_USER, method = RequestMethod.POST)
	public String authenticationAdmin(Admin admin) {

		return adminService.findByAdminId(admin);

	}
	
	
}
