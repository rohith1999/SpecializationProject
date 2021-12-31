package com.th.services;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;
import com.th.repository.AdminRepository;
import com.th.repository.BookPaginationRepository;
import com.th.repository.BookRepository;

/**
 * 
 * UserServiceImpl implements the business logic for registering and
 * authenticating a user
 * 
 * @author Rohith S
 *
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	BookPaginationRepository bookPaginationRepository;

	@Override
	public ModelAndView findByAdminId(Admin admin) {

		Optional<Admin> searchAdminUser = adminRepository.findById(admin.getAdminid());
		ModelAndView modelAndView = new ModelAndView();
		if (searchAdminUser.isPresent()) {
			Admin adminUser = searchAdminUser.get();

			modelAndView.setViewName("admin");

			if (admin.getAdminpassword().equals(adminUser.getAdminpassword())) {

				modelAndView.addObject("admin", adminUser);
				
//				Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
				

				
				List<Book> bookList = bookRepository.findAll();

				Collections.sort(bookList);
				modelAndView.addObject("books", bookList);

				List<Book> bookTimeStamp = bookRepository.findAll();
				Collections.sort(bookTimeStamp, new Comparator<Book>() {
					@Override
					public int compare(Book o1, Book o2) {
						return o2.getBooktimestamp().compareTo(o1.getBooktimestamp());
					}
				});

				modelAndView.addObject("bookTimeStamp", bookTimeStamp);

			} else {
				modelAndView.setViewName("index");

			}

		} else
			modelAndView.setViewName("invalid");

		return modelAndView;

	}

	@Override
	public ModelAndView removeBook(int idbook) {
		ModelAndView modelAndView = new ModelAndView();

		if (bookRepository.existsById(idbook)) {
			bookRepository.deleteById(idbook);
			modelAndView.setViewName("success");
			return modelAndView;
		} else {
			modelAndView.setViewName("invalid");
			return modelAndView;
		}
	}

	@Override
	public ModelAndView updateBook(Book book) {
		
		ModelAndView modelAndView = new ModelAndView();
		Optional<Book> searchBook = bookRepository.findById(book.getidbook());

		if (searchBook.isPresent()) {
			Book bookFoundBook = bookRepository.save(book);
			modelAndView.setViewName("success");
			return modelAndView;
		} else {
			modelAndView.setViewName("invalid");
			return modelAndView;
		}

	}

}
