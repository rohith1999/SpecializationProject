package com.th.model;

import javax.persistence.Entity;
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

	/**
	 * useremail is the primary key that uniquely identifies rows in user table
	 */
	@Id
	private String useremail;

	/**
	 * password holds password i.e hashed using password encoder
	 */
	private String password;

	/**
	 * name of the user
	 */
	private String name;

	/**
	 * gets user email id
	 * 
	 * @return
	 */
	public String getUseremail() {
		return useremail;
	}

	/**
	 * sets user email id
	 * 
	 * @param useremail
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 * gets user's password
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * sets user's password in encoded form
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * gets user name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets user name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * default constructor for User
	 */
	public User() {
		super();
	}

	/**
	 * parameterized contructor for User
	 * 
	 * @param userid
	 * @param useremail
	 * @param password
	 * @param phoneno
	 */
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
