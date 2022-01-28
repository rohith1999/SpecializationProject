package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.User;

/**
 * 
 * 
 * UserRepository extends Jpa repository that allows to perform CRUD operations on User table
 * 
 * @author Rohith S 
 */
public interface UserRepository extends JpaRepository<User,String> {

}
