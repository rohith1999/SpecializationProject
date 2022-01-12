package com.th.services;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Admin;
import com.th.model.Book;
import com.th.repository.AdminRepository;
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

	@Override
	public ModelAndView findByAdminId(Admin admin) {

		Optional<Admin> searchAdminUser = adminRepository.findById(admin.getAdminid());
		ModelAndView modelAndView = new ModelAndView();
		if (searchAdminUser.isPresent()) {
			Admin adminUser = searchAdminUser.get();

			modelAndView.setViewName("admin");

			if (admin.getAdminpassword().equals(adminUser.getAdminpassword())) {

				modelAndView.addObject("admin", adminUser);


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
	public ModelAndView updateBook(Book book, @RequestParam("bookimg") MultipartFile file) throws IOException {

		ModelAndView modelAndView = new ModelAndView();
		Optional<Book> searchBook = bookRepository.findById(book.getidbook());

		if (searchBook.isPresent()) {
			Book foundBook = searchBook.get();

			if (!book.getBookname().isEmpty())
				foundBook.setBookname(book.getBookname());

			if (!book.getGenre().isEmpty())
				foundBook.setGenre(book.getGenre());

			if (book.getBookprice() > 0)
				foundBook.setBookprice(book.getBookprice());

			foundBook.setBooktimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
			if (file.getSize() > 0) {
				System.out.println("entered");

				foundBook.setBookimage(file.getBytes());

			}

			Book updatedBook = bookRepository.save(foundBook);
			modelAndView.setViewName("success");
			return modelAndView;
		} else {
			modelAndView.setViewName("invalid");
			return modelAndView;
		}

	}

	@Override
	public ModelAndView addBook(Book book, @RequestParam("bookimg") MultipartFile file) throws IOException {

		ModelAndView modelAndView = new ModelAndView();
		Optional<Book> searchBook = bookRepository.findById(book.getidbook());

		if (!(searchBook.isPresent())) {

			Book newBook = new Book();

			newBook.setidbook(book.getidbook());
			newBook.setBookname(book.getBookname());

			newBook.setGenre(book.getGenre());

			newBook.setBookprice(book.getBookprice());

			newBook.setBooktimestamp(new java.sql.Timestamp(System.currentTimeMillis()));

			newBook.setBookimage(file.getBytes());

			Book newBookSave = bookRepository.save(newBook);
			modelAndView.setViewName("success");
			return modelAndView;
		} else {
			modelAndView.setViewName("invalid");
			return modelAndView;
		}
	}

}
