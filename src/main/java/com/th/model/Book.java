package com.th.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Book is a POJO class that has id,name, price and genre
 * @author Rohith S
 *
 */
@Entity
public class Book implements Comparable<Book> {
	
	@Id
	private int idbook;


	private String bookname;
	private double bookprice;
	private String genre;
	private Timestamp booktimestamp=null;
	private byte[] bookimage;
	 
	
	public int getIdbook() {
		return idbook;
	}



	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}
	
	
	public byte[] getBookimage() {
		
		return bookimage;
	}



	public void setBookimage(byte[] bookimage) {
		this.bookimage = bookimage;
	}



	public Book(int idbook, String bookname, double bookprice,String genre) {
		this.idbook = idbook;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.genre = genre;

		
	}

	

	public Timestamp getBooktimestamp() {
		return booktimestamp;
	}

	public void setBooktimestamp(Timestamp booktimestamp) {
		this.booktimestamp = booktimestamp;
	}

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

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double d) {
		this.bookprice = d;


	}
	




	@Override
	public String toString() {
		return "Book [idbook=" + idbook + ", Bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	
	@Override
		public int compareTo(Book o) {
			// TODO Auto-generated method stub
		if(bookprice==o.getBookprice())
			return 0;
		else if(bookprice<o.getBookprice()) 
			return 1;
		else
			return -1;
		
		}

	
	
}