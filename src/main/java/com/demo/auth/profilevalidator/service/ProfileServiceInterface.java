package com.demo.auth.profilevalidator.service;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.model.GetUserProfileResponse;
import com.demo.auth.profilevalidator.model.UserDetailsRequest;
/**
 * Profile Service Interface
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ProfileServiceInterface {

	GetUserProfileResponse getUserProfile(
			UserDetailsRequest userDetailsRequest)
			throws ProfileException, JsonProcessingException;

}
