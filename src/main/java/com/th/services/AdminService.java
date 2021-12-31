package com.th.services;

import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;

public interface AdminService {
	
	/**
	 * findByUserEmail (finds a admin user using his email id) 
	 * @param admin
	 * @return
	 */
	public ModelAndView findByAdminId(Admin admin);
	public ModelAndView removeBook(int idbook);
	public ModelAndView updateBook(Book book);


}
