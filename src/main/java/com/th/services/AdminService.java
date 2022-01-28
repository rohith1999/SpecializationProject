package com.th.services;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;

/**
 * 
 * @author Rohith S
 * AdminService defines all the method headers to be implemented
 */
public interface AdminService {
	
	/**
	 * findByAdminId (finds a admin user using his admin id) 
	 * @param admin consists of admin name, password and name
	 * @return ModelAndView (the html page and the objects to be returned)
	 */
	public ModelAndView findByAdminId(Admin admin);
	
	/**
	 * removes a book from book table
	 * @param idbook
	 * @return ModelAndView (the html page and the objects to be returned)
	 */
	public ModelAndView removeBook(int idbook);
	
	/**
	 * updates the book details onto the database
	 * @param book
	 * @param file is the image of the book
	 * @return ModelAndView (the html page and the objects to be returned)
	 * @throws IOException
	 */
	public ModelAndView updateBook(Book book,@RequestParam("bookimg") MultipartFile file)throws IOException;
	
	/**
	 * adds a new book to the book table 
	 * @param book
	 * @param file file is the image of the book
	 * @return ModelAndView (the html page and the objects to be returned)
	 * @throws IOException
	 */
	public ModelAndView addBook(Book book,@RequestParam("bookimg") MultipartFile file)throws IOException;


}
