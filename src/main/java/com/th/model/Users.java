package com.th.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private String useremail;
	private String password;
	private BigInteger phoneno;
	
	
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public BigInteger getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public Users() {
		super();
	}
	public Users(int userid, String useremail, String password, BigInteger phoneno) {
		super();
		this.useremail = useremail;
		this.password = password;
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Users [ "+ "useremail=" + useremail + ", password=" + password + ", phoneno="
				+ phoneno + "]";
	}
	
	
	

}
