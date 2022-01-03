package com.th.model;

import java.util.List;

import org.springframework.stereotype.Component;

public class BookForm {
	
	private List<Book> books;
	
	public BookForm() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void setBook(Book book) {
        books.add(book);
    }
 
 public List<Book> getBooks() {
       return books;
    }

}
