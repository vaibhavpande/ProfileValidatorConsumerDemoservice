package com.demo.auth.profilevalidator.exception;
/**
 * Model class Profile Exception
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class ProfileException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;

	String errorCode;
	String errorMessage;

	public ProfileException() {
		super();
	}

	public ProfileException(final String message) {
		super(message);
	}

	public ProfileException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
