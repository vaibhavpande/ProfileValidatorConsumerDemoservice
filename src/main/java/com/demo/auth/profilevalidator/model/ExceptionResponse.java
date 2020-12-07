package com.demo.auth.profilevalidator.model;
/**
 * Model class for Exception Response
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class ExceptionResponse {

	private String errorMessage;
	private String errorCode;
	private String requestedURI;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestedURI() {
		return requestedURI;
	}

	public void callerURL(final String requestedURI) {
		this.requestedURI = requestedURI;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
