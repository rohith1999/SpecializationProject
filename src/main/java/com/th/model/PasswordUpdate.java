package com.th.model;
/**
 * {@link PasswordUpdate} POJO for updating password
 * @author Rohith S
 *
 */
public class PasswordUpdate {
	
	private String useremail;
	private String oldPassword;
	private String newPassword;
	
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public PasswordUpdate(String useremail, String oldPassword, String newPassword) {
		super();
		this.useremail = useremail;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}
	
	
	

}
