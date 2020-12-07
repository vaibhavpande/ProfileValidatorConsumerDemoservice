package com.demo.auth.profilevalidator.model;
/**
 * Model class for User Details Request
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class UserDetailsRequest {

	private String emailAddr;

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	@Override
	public String toString() {
		return "UserDetailsRequest [emailAddr=" + emailAddr + "]";
	}

}
