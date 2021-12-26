package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
public class Userscart {

@Id
private int bookid;
private int userid; 
private int quantity;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}



public Userscart() {
	super();
}
public Userscart(int bookid, int userid, int quantity) {
	super();
	this.bookid = bookid;
	this.userid = userid;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Userscart [bookid=" + bookid + ", userid=" + userid + ", quantity=" + quantity + "]";
}






}
