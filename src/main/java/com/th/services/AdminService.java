package com.th.services;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;
import com.th.model.BookForm;
/**
 * 
 * @author Rohith S
 *
 */
public interface AdminService {
	
	/**
	 * findByUserEmail (finds a admin user using his email id) 
	 * @param admin
	 * @return
	 */
	public ModelAndView findByAdminId(Admin admin);
	public ModelAndView removeBook(int idbook);
	public ModelAndView updateBook(Book book,@RequestParam("bookimg") MultipartFile file)throws IOException;
	public ModelAndView addBook(Book book,@RequestParam("bookimg") MultipartFile file)throws IOException;


}
