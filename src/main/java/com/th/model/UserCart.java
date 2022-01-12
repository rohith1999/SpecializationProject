package com.th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserCart is a POJO class that has bookid, useremail, and qunatity
 * 
 * @author Rohith S
 *
 */
@Table(name = "userscart")
@Entity
public class UserCart {

	/**
	 * cartid is the primary key that uniquely identifies a row in the usercart
	 * table and the values are auto incremented
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;

	/**
	 * bookid is the unique id of the book in the book table
	 */
	private int bookid;

	/**
	 * user email that has ordered the book
	 */
	private String useremail;

	/**
	 * quantity is the number of books the user has ordered
	 */
	private int quantity;

	/**
	 * gets the book id
	 * 
	 * @return
	 */
	public int getBookid() {
		return bookid;
	}

	/**
	 * sets the book id
	 * 
	 * @param bookid
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	/**
	 * gets the user email
	 * 
	 * @return
	 */
	public String getUseremail() {
		return useremail;
	}

	/**
	 * sets the user email
	 * 
	 * @param useremail
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 * gets the quantity of books ordered
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * sets the quantity of books ordered
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * gets cart id
	 * 
	 * @return
	 */
	public int getCartid() {
		return cartid;
	}

	/**
	 * sets cart id
	 * 
	 * @param cartid
	 */
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	/**
	 * default constructer of Usercart
	 */
	public UserCart() {
		super();
	}

	@Override
	public String toString() {
		return "UserCart [bookid=" + bookid + ", useremail=" + useremail + ", quantity=" + quantity + "]";
	}

}
