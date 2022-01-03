package com.th.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.th.constants.PropertyConstant;
import com.th.model.Admin;
import com.th.model.Book;
import com.th.model.BookForm;
import com.th.model.User;
import com.th.services.AdminService;

/**
 * AdminController is used to authenticate a user
 * @author Rohith S
 *
 */
@Controller
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
	public ModelAndView authenticationAdmin(Admin admin) {

		return adminService.findByAdminId(admin);

	}
	
	@PostMapping("/admin/delete")
	public ModelAndView deleteBookById(int idbook){
		
	   ModelAndView modelAndView = adminService.removeBook(idbook);
	   return modelAndView;
	   
		
	}
	
	@PostMapping("/admin/update")
	public ModelAndView UpdateBookById(Book book){
		
	   ModelAndView modelAndView = adminService.updateBook(book);
	   return modelAndView;
	   
		
	}
	
	@PostMapping("/admin/addbook")
	public ModelAndView addBook(@ModelAttribute Book book) {
		
		return adminService.addBook(book);
		
		
	}
	
	
}
