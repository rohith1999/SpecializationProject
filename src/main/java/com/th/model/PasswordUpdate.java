package com.th.model;
/**
 * {@link PasswordUpdate} POJO for updating password
 * @author Rohith S
 *
 */
public class PasswordUpdate {
	
	/**
	 * user's email id to update his password
	 */
	private String useremail;
	
	/**
	 * old password that user used to authenticate
	 */
	private String oldPassword;
	
	/**
	 * new password that user wants to set
	 */
	private String newPassword;
	
	
	/**
	 * gets user email id
	 * @return
	 */
	public String getUseremail() {
		return useremail;
	}
	
	/**
	 * sets user email id
	 * @param useremail
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	/**
	 * gets user's old password
	 * @return
	 */
	public String getOldPassword() {
		return oldPassword;
	}
	
	/**
	 * sets old user password
	 * @param oldPassword
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	/**
	 * gets new user password
	 * @return
	 */
	public String getNewPassword() {
		return newPassword;
	}
	
	/**
	 * sets new user password
	 * @param newPassword
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	/**
	 * Parameterized constructor for PasswordUpdate
	 * @param useremail
	 * @param oldPassword
	 * @param newPassword
	 */
	public PasswordUpdate(String useremail, String oldPassword, String newPassword) {
		super();
		this.useremail = useremail;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}
	
	
	

}
