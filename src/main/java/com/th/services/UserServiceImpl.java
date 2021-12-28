package com.th.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.th.model.User;
import com.th.repository.UsersRepository;

/**
 * 
 * UserServiceImpl implements the business logic for registering and authenticating a user
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

	
	@Override
	public String findByUserEmail(User user) {

		Optional<User> searchUser = usersRepository.findById(user.getUseremail());
		if (searchUser.isPresent()) {
			User userFromDb = searchUser.get();
			if (passwordEncoder.matches(user.getPassword(), userFromDb.getPassword())) {

				return "home";
			} else {
				return "login";
			}

		} else
			return "invalid";

	}

	@Override
	public String registerUser(User user) {
		Optional<User> searchUser = usersRepository.findById(user.getUseremail());
		if (searchUser.isPresent()) {
			User userFound = searchUser.get();
			return "login";

		} else {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			User saveUser = usersRepository.save(user);
			return "home";
		}
	}

}
