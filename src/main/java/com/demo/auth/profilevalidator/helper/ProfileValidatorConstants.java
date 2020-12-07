package com.demo.auth.profilevalidator.helper;

/**
 * Constants class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public class ProfileValidatorConstants {

	public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
	public static final String PARSING_EXCEPTION_MSG = "Exception in parsing an object to json";
	public static final String ERROR_CODE_400 = "400";
	public static final String INVALID_REQUEST_PARAMETER_MSG = "Invalid request parameter";
	public static final String INVALID_PROFILE_ERROR = "INVALID PROFILE";
	public static final String INVALID_PROFILE_ERROR_MSG = "Requested profile is invalid.";
	public static final String MISSING_MANDATORY_PARAMETER_MSG = "Missing mandatory parameter";

	public static ProfileValidatorConstants getObject() {
		return new ProfileValidatorConstants();
	}
}
