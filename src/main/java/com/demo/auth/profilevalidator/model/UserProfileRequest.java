package com.demo.auth.profilevalidator.model;

/**
 * Model class for UserProfile Request
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class UserProfileRequest {

	private String emailAddr;

	private String userName;

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserProfileRequest [emailAddr=" + emailAddr + ", userName=" + userName + "]";
	}
}
