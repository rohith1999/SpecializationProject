package com.th.services;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Book;
import com.th.model.PasswordUpdate;
import com.th.model.User;
/**
 * 
 * @author Rohith S
 * User Service defines all the method headers to be
 * implemented
 */
public interface UserService {
	
	
	/**
	 * findByUserEmail (finds a user using his email id) 
	 * @param user
	 * @return String (return index if successful or else invalid)
	 */
	public ModelAndView findByUserEmail(User user,Model model);
	
	/**
	 * registerUser (registers a user to the bookstore application)
	 * @param user
	 * @return String (returns to home page if successful else goes to login page)
	 */
    public ModelAndView registerUser(User user,Model model);
    
   /** 
    * updates a password for an existing logged in user
    * @param passwordUpdate
    * @return (returns to home page if successful else goes to login page)
    */
    public String passwordChange(PasswordUpdate passwordUpdate);
    
    /**
     * search a book by bookname
     * @param bname
     * @param useremail
     * @param model
     * @return String (return search page)
     */
    public String bookSearch(String bname ,String useremail, Model model);
 
}
