package com.th.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.th.model.User;
import com.th.repository.BookRepository;
import com.th.repository.UsersRepository;
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
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	BookRepository bookRepository;

	@Override
	public ModelAndView findByUserEmail(User user) {

		Optional<User> searchUser = usersRepository.findById(user.getUseremail());

		ModelAndView modelAndView = new ModelAndView();
		if (searchUser.isPresent()) {
			User userFromDb = searchUser.get();

			if (passwordEncoder.matches(user.getPassword(), userFromDb.getPassword())) {

				modelAndView.setViewName("user");
				modelAndView.addObject("books", bookRepository.findAll());
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
	public String registerUser(User user) {
		Optional<User> searchUser = usersRepository.findById(user.getUseremail());
		if (searchUser.isPresent()) {
			User userFound = searchUser.get();
			return "index";

		} else {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			User saveUser = usersRepository.save(user);
			return "user";
		}
	}

}
