package com.demo.auth.profilevalidator.service;
/**
 * Profile Validation Service class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.model.UserDetailsRequest;

public interface ProfileValidationService {

	public void validateGetUserProfileRequest(
			UserDetailsRequest userDetailsRequest) throws ProfileException;

}