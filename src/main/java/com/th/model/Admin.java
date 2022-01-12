package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Admin is a POJO class that has admin id and password
 * 
 * @author Rohith S
 * 
 */
@Entity
public class Admin {

	/**
	 * admin id is the primary key uniquely identifies each admin
	 */
	@Id
	private int adminid;

	/**
	 * admin password to used to authenticate an admin
	 */
	private String adminpassword;

	/**
	 * name of the admin of type string
	 */
	private String adminname;

	/**
	 * get admin id
	 * 
	 * @return
	 */
	public int getAdminid() {
		return adminid;
	}

	/**
	 * sets admin id
	 * 
	 * @param adminid
	 */
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	/**
	 * gets password for admin user
	 * 
	 * @return
	 */
	public String getAdminpassword() {
		return adminpassword;
	}

	/**
	 * sets admin password
	 * 
	 * @param adminpassword
	 */
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	/**
	 * get admin name
	 * 
	 * @return
	 */
	public String getAdminname() {
		return adminname;
	}

	/**
	 * sets admin name
	 * 
	 * @param adminname
	 */
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
