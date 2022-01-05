package com.th.services;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.PasswordUpdate;
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
	public ModelAndView findByUserEmail(User user,Model model);
	
	/**
	 * registerUser (registers a user to the bookstore application)
	 * @param user
	 * @return String (returns to home page if successful else goes to login page)
	 */
    public String registerUser(User user);
    
    
   /**
    * 
    * @param passwordUpdate
    * @return
    */
    public String passwordChange(PasswordUpdate passwordUpdate);
    
    
}
