package com.th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * UserCart is a POJO class that has bookid, useremail, and qunatity
 * 
 * @author Rohith S
 *
 */
@Table(name = "userscart")
@Entity
public class UserCart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
	private int bookid;
	private String useremail;
	private int quantity;

	

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public UserCart() {
		super();
	}



	@Override
	public String toString() {
		return "UserCart [bookid=" + bookid + ", useremail=" + useremail + ", quantity=" + quantity + "]";
	}

}
