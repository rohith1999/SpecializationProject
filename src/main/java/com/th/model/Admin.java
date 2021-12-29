package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Admin is a POJO class that has admin id and password
 * @author Rohith S
 * 
 */
@Entity
public class Admin {
	
	@Id
	private int adminid;
	private String adminpassword;
	
	
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	

}
