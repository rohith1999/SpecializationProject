package com.th.services;

import com.th.model.User;
/**
 * 
 * @author Rohith S
 *
 */
public interface UserService {
	
	
	/**
	 * findByUserEmail (finds a user using his email id) 
	 * @param user
	 * @return
	 */
	public String findByUserEmail(User user);
	
	/**
	 * registerUser (registers a user to the bookstore application)
	 * @param user
	 * @return String (returns to home page if successful else goes to login page)
	 */
    public String registerUser(User user);
    
    
    
}
