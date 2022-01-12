package com.th.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.th.constants.PropertyConstant;
import com.th.model.Admin;
import com.th.model.Book;
import com.th.services.AdminService;

/**
 * AdminController is used to authenticate a user
 * 
 * @author Rohith S
 *
 */
@Controller
public class AdminController {	

	/**
	 * adminService autowires all functionalities of admin to AdminController
	 */
	@Autowired
	AdminService adminService;

	/**
	 * auth matches user password with encrypted password in database
	 * 
	 * @param admin with properties useremail and password
	 * @return String which redirects to home page or back to login page
	 */
	@RequestMapping(value = PropertyConstant.AUTH_USER, method = RequestMethod.POST)
	public ModelAndView authenticationAdmin(Admin admin) {

		return adminService.findByAdminId(admin);

	}

	/**
	 * deletes a book using its bookId
	 * 
	 * @param idbook which has to deleted from MYSQL database
	 * @return String which returns a success page or invalid page
	 */
	@PostMapping(PropertyConstant.ADMIN_DELETE)
	public ModelAndView deleteBookById(int idbook) {

		ModelAndView modelAndView = adminService.removeBook(idbook);
		return modelAndView;

	}

	/**
	 * Updates an existing book details which is residing in MYSQL database
	 * 
	 * @param book (constitls of book details that must be updated)
	 * @param file (image of the book)
	 * @return String which returns a success page or invalid page
	 * @throws IOException
	 */
	@PostMapping(PropertyConstant.ADMIN_UPDATE)
	public ModelAndView UpdateBookById(Book book, @RequestParam("bookimg") MultipartFile file) throws IOException {

		ModelAndView modelAndView = adminService.updateBook(book, file);
		return modelAndView;

	}

	/**
	 * Adds a new book onto the MYSQL database
	 * 
	 * @param book (constitls of book details that must be updated)
	 * @param file (image of the book)
	 * @return String which returns a success page or invalid page
	 * @throws IOException
	 */
	@PostMapping(PropertyConstant.ADMIN_ADD)
	public ModelAndView addBook(Book book, @RequestParam("bookimg") MultipartFile file) throws IOException {

		return adminService.addBook(book, file);

	}

}
