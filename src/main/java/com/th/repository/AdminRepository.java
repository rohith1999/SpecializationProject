package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.Admin;
/**
 * 
 * @author Rohith S
 * AdminRepository extends Jpa repository that allows to perform CRUD operations on admin table
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	

}
