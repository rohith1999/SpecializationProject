package com.th.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Book is a POJO class that has id, name, price and genre timestamp and image
 * 
 * @author Rohith S
 *
 */
@Entity
public class Book implements Comparable<Book> {

	/**
	 * idbook is the primary key that uniquely identifies a row in book table
	 */
	@Id
	private int idbook;

	/**
	 * bookname (name of the book)
	 */
	private String bookname;

	/**
	 * bookprice (price of the book)
	 */
	private double bookprice;

	/**
	 * genre (genre of the book)
	 */
	private String genre;
	/**
	 * booktimestamp (at what time and date the book was added)
	 */
	private Timestamp booktimestamp = null;

	/**
	 * bookimage (image of the book in bytes array)
	 */
	private byte[] bookimage;

	/**
	 * gets the id of the book in integer type
	 * 
	 * @return
	 */
	public int getIdbook() {
		return idbook;
	}

	/**
	 * sets the book id in integer type
	 * 
	 * @param idbook
	 */
	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}

	/**
	 * gets the bookimage in byte array type
	 * 
	 * @return
	 */
	public byte[] getBookimage() {

		return bookimage;
	}

	/**
	 * sets the book image
	 * 
	 * @param bookimage
	 */
	public void setBookimage(byte[] bookimage) {
		this.bookimage = bookimage;
	}

	/**
	 * parameterized constructor
	 * 
	 * @param idbook
	 * @param bookname
	 * @param bookprice
	 * @param genre
	 */
	public Book(int idbook, String bookname, double bookprice, String genre) {
		this.idbook = idbook;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.genre = genre;

	}

	/**
	 * gets TimeStamp of the book
	 * 
	 * @return
	 */
	public Timestamp getBooktimestamp() {
		return booktimestamp;
	}

	/**
	 * sets TimeStamp of the book
	 * 
	 * @param booktimestamp
	 */
	public void setBooktimestamp(Timestamp booktimestamp) {
		this.booktimestamp = booktimestamp;
	}

	/**
	 * sets genre of the book
	 * 
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * gets genre of the book
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;

	}

	/**
	 * default constructor
	 */
	public Book() {

	}

	/**
	 * gets id of the book
	 * 
	 * @return
	 */
	public int getidbook() {
		return idbook;
	}

	/**
	 * sets id of the book
	 * 
	 * @param idbook
	 */
	public void setidbook(int idbook) {
		this.idbook = idbook;

	}

	/**
	 * gets book name
	 * 
	 * @return
	 */
	public String getBookname() {
		return bookname;
	}

	/**
	 * gets book name of type string
	 * 
	 * @param bookname
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	/**
	 * get book price of type double
	 * 
	 * @return
	 */
	public double getBookprice() {
		return bookprice;
	}

	/**
	 * sets bookprice of type double
	 * 
	 * @param d
	 */
	public void setBookprice(double d) {
		this.bookprice = d;

	}
	

	@Override
	public String toString() {
		return "Book [idbook=" + idbook + ", Bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

	/**
	 * CompareTo sorts the books based on book price
	 */
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (bookprice == o.getBookprice())
			return 0;
		else if (bookprice < o.getBookprice())
			return 1;
		else
			return -1;

	}

}