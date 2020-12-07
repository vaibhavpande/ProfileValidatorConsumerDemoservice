package com.demo.auth.profilevalidator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.helper.ProfileValidatorConstants;
import com.demo.auth.profilevalidator.model.GetUserProfileResponse;
import com.demo.auth.profilevalidator.model.UserDetailsRequest;
import com.demo.auth.profilevalidator.model.UserDetailsResponse;
import com.demo.auth.profilevalidator.model.UserProfileRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Profile Service Implementation class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@Service
public class ProfileServiceImpl implements ProfileServiceInterface {

	@Autowired
	ProfileDao daoService;

	@Override
	public GetUserProfileResponse getUserProfile(UserDetailsRequest userDetailsRequest)
			throws ProfileException, JsonProcessingException {

		UserProfileRequest userProfileRequest = new UserProfileRequest();
		userProfileRequest.setEmailAddr(userDetailsRequest.getEmailAddr());

		GetUserProfileResponse userProfileResponse = new GetUserProfileResponse();

		UserDetailsResponse userDetailsResponse = daoService
				.fetcheUserProfile(userProfileRequest);
		if (null == userDetailsResponse) {
			throw new ProfileException(ProfileValidatorConstants.INVALID_PROFILE_ERROR,
					ProfileValidatorConstants.INVALID_PROFILE_ERROR_MSG);
		}
		if (null != userDetailsResponse.getErrorCode()) {
			throw new ProfileException(userDetailsResponse.getErrorCode(),
					userDetailsResponse.getErrorDescription());
		}
		return userProfileResponse;
	}

}
