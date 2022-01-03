package com.th.services;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;
import com.th.model.BookForm;

public interface AdminService {
	
	/**
	 * findByUserEmail (finds a admin user using his email id) 
	 * @param admin
	 * @return
	 */
	public ModelAndView findByAdminId(Admin admin);
	public ModelAndView removeBook(int idbook);
	public ModelAndView updateBook(Book book);
	public ModelAndView addBook(Book book);


}
