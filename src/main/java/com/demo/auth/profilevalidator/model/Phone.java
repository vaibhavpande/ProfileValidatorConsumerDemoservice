package com.demo.auth.profilevalidator.model;

/**
 * Model class for Phone
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class Phone {
	private String phone;
	private String number;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + ", number=" + number + "]";
	}
}