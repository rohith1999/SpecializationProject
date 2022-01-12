package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.Book;

/**
 * 
 * @author Rohith S 
 * BookRepository extends Jpa repository that allows to perform
 * CRUD operations on book table
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}