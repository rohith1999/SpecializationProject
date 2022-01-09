package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * UserCart is a POJO class that has bookid, useremail, and qunatity
 * @author Rohith S
 *
 */
@Table(name = "userscart")
@Entity
public class UserCart {

@Id
private int bookid;
private String useremail; 
private int quantity;

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getUserid() {
	return useremail;
}
public void setUserid(String useremail) {
	this.useremail = useremail;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}



public UserCart() {
	super();
}
public UserCart(int bookid, String useremail, int quantity) {
	super();
	this.bookid = bookid;
	this.useremail = useremail;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "UserCart [bookid=" + bookid + ", useremail=" + useremail + ", quantity=" + quantity + "]";
}






}
