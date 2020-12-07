package com.demo.auth.profilevalidator.service;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.model.UserDetailsResponse;
import com.demo.auth.profilevalidator.model.UserProfileRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Dao Interface for profile
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
public interface ProfileDao {
	UserDetailsResponse fetcheUserProfile(UserProfileRequest userProfileRequest)
			throws ProfileException, JsonProcessingException;
}
