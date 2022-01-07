package com.th.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.Admin;
import com.th.model.Book;
/**
 * 
 * @author Rohith 
 *
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	

}
