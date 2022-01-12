package com.th.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Book;
import com.th.model.PasswordUpdate;
import com.th.model.User;
import com.th.repository.BookRepository;
import com.th.repository.UserRepository;
import com.th.util.ImageUtil;

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
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	BookRepository bookRepository;

	@Override
	public ModelAndView findByUserEmail(User user,Model model) {

		Optional<User> searchUser = userRepository.findById(user.getUseremail());

		ModelAndView modelAndView = new ModelAndView();
		if (searchUser.isPresent()) {
			User userFromDb = searchUser.get();

			if (passwordEncoder.matches(user.getPassword(), userFromDb.getPassword())) {

				modelAndView.setViewName("user");
				modelAndView.addObject("books", bookRepository.findAll());
				
				model.addAttribute("imgUtil", new ImageUtil());
				model.addAttribute("user",userFromDb);
				
				
				List<Book> bookTimeStamp = bookRepository.findAll();

				Collections.sort(bookTimeStamp, new Comparator<Book>() {
					@Override
					public int compare(Book o1, Book o2) {
						return o2.getBooktimestamp().compareTo(o1.getBooktimestamp());
					}
				});

				modelAndView.addObject("bookTimeStamp", bookTimeStamp);
				
				return modelAndView;

			} else {
				modelAndView.setViewName("index");
				return modelAndView;
			}

		} else {
			modelAndView.setViewName("invalid");

			return modelAndView;
		}
	}

	@Override
	public ModelAndView registerUser(User user,Model model) {
		Optional<User> searchUser = userRepository.findById(user.getUseremail());
		ModelAndView modelAndView =new ModelAndView();
		
		if (searchUser.isPresent()) {
			User userFound = searchUser.get();
			modelAndView.setViewName("index");
			return modelAndView;

		} else {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			User saveUser = userRepository.save(user);
			
			
			modelAndView.addObject("books", bookRepository.findAll());
			
			model.addAttribute("imgUtil", new ImageUtil());
			model.addAttribute("user",user);
			
			List<Book> bookTimeStamp = bookRepository.findAll();

			Collections.sort(bookTimeStamp, new Comparator<Book>() {
				@Override
				public int compare(Book o1, Book o2) {
					return o2.getBooktimestamp().compareTo(o1.getBooktimestamp());
				}
			});

			modelAndView.addObject("bookTimeStamp", bookTimeStamp);
			
			modelAndView.setViewName("user");
			return modelAndView;
		}
	}

	@Override
	public String passwordChange(PasswordUpdate passwordUpdate) {
		
		Optional<User> searchUser = userRepository.findById(passwordUpdate.getUseremail());
		
		if (searchUser.isPresent()) {
			User userFound = searchUser.get();
			if(passwordEncoder.matches(passwordUpdate.getOldPassword(),userFound.getPassword())) {
				userFound.setPassword(passwordEncoder.encode(passwordUpdate.getNewPassword()));
				return "success";
			}else {
				return "index";
			}
			

		}else {
			return "index";
		}
	}

}
