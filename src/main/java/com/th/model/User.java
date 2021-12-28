package com.th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User is a POJO class that has useremail, password, and phone number
 * 
 * @author Rohith S
 *
 */
@Table(name = "users")
@Entity
public class User {

	@Id
	private String useremail;
	private String password;
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		super();
	}

	public User(int userid, String useremail, String password, String phoneno) {
		super();
		this.useremail = useremail;
		this.password = password;
		this.name = phoneno;
	}

	@Override
	public String toString() {
		return "User [ " + "useremail=" + useremail + ", password=" + password + ", name=" + name + "]";
	}

}
