package com.demo.auth.profilevalidator.model;

/**
 * Model class for Emails
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class Email {
	private String emailAddr;
	private String typeCode;
	private boolean isIsPrimary;
	private String addressTypeCode;
	private String address;

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public boolean isIsPrimary() {
		return isIsPrimary;
	}

	public void setIsPrimary(boolean isIsPrimary) {
		this.isIsPrimary = isIsPrimary;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Email [emailAddr=" + emailAddr + ", typeCode=" + typeCode + ", isIsPrimary=" + isIsPrimary
				+ ", addressTypeCode=" + addressTypeCode + ", address=" + address + "]";
	}
}