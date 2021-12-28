package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Book is a POJO class that has id,name, price and genre
 * @author Rohith S
 *
 */
@Entity
public class Book {
	
	@Id
	private int idbook;
	private String bookname;
	private double bookprice;
	private String genre;
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Book() {
		
	}

	public int getidbook() {
		return idbook;
	}

	public void setidbook(int idbook) {
		this.idbook = idbook;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getBook_price() {
		return bookprice;
	}

	public void setBook_price(int bookprice) {
		this.bookprice = bookprice;
	}

	public Book(int idbook, String bookname, int book_price) {
		this.idbook = idbook;
		this.bookname = bookname;
		this.bookprice = book_price;
	}

	@Override
	public String toString() {
		return "Book [idbook=" + idbook + ", Bookname=" + bookname + ", book_price=" + bookprice + "]";
	}

	
	
}