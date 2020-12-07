package com.demo.auth.profilevalidator.model;

import java.util.Arrays;
/**
 * Model class for UserInfo
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
//internal class for get user profile
public class UserInfo {

	String metRfrId;
	String userId;
	Email email[];
	Phone phone[];

	public String getMetRfrId() {
		return metRfrId;
	}

	public void setMetRfrId(String metRfrId) {
		this.metRfrId = metRfrId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Email[] getEmail() {
		return email;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public Phone[] getPhone() {
		return phone;
	}

	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInfo [metRfrId=" + metRfrId + ", userId=" + userId + ", email=" + Arrays.toString(email)
				+ ", phone=" + Arrays.toString(phone) + "]";
	}

}
