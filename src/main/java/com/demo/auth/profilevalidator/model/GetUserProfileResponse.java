package com.demo.auth.profilevalidator.model;
/**
 * Model class for GetUserProfileResponse
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class GetUserProfileResponse {

	@JsonProperty("emailAddr")
	private List<Email> emailAddr;

	@JsonProperty("phone")
	private List<Phone> phone;
	
	@JsonProperty("tansactionId")
	private String transID; 

	public List<Email> getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(List<Email> emailAddr) {
		this.emailAddr = emailAddr;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

	@Override
	public String toString() {
		return "GetUserProfileResponse [emailAddr=" + emailAddr + ", phone=" + phone + ", transID=" + transID + "]";
	}
}
