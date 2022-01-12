package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.User;

/**
 * 
 * @author Rohith S
 * UserRepository extends Jpa repository that allows to perform CRUD operations on User table
 */
public interface UserRepository extends JpaRepository<User,String> {

}
