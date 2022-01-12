package com.th.dto;

import com.th.model.Book;
/**
 * UserCartDTO is a POJO class that has book and quantity
 * @author Rohith S
 *
 */
public class UserCartDTO {

	/**
	 * Book is an Entity class that consists of attributes id, name, price and genre timestamp and image 
	 */
	private Book book;
	
	/**
	 * quantity is number of a particular book added by user
	 */
	private int quantity;

	/**
	 * gets a book object 
	 * @return book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * sets a book object
	 * @param book
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * gets quantity of a book
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * sets quantity of a book
	 * @param quantity 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
