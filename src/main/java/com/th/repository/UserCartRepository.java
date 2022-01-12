package com.th.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.UserCart;

/**
 * 
 * @author Rohith S
 * UserCartRepository extends Jpa repository that allows to perform CRUD operations on user cart table
 * CRUD operations
 */
@Repository
public interface UserCartRepository extends JpaRepository<UserCart,Integer> {
	
	/**
	 * finds all books ordered by a particular user
	 * @param useremail 
	 * @return List<UserCart> (list of books ordered by a user)
	 */
	List<UserCart> findByUseremail(String useremail);
	
	/**
	 * finds a book using useremail and bookid 
	 * @param useremail
	 * @param bookid
	 * @return UserCart 
	 */
	UserCart findByUseremailAndBookid(String useremail, int bookid);
	

}
