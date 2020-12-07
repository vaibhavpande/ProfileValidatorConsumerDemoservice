package com.demo.auth.profilevalidator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.model.GetUserProfileResponse;
import com.demo.auth.profilevalidator.model.UserDetailsRequest;
import com.demo.auth.profilevalidator.service.ProfileServiceInterface;
import com.demo.auth.profilevalidator.service.ProfileValidationService;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * ProfileValidator Controller class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/profile/v1")
public class ProfileValidatorController {

	@Autowired
	ProfileServiceInterface profileValidatorService;

	@Autowired
	ProfileValidationService validationService;

	Logger logger = LoggerFactory.getLogger(ProfileValidatorController.class);

	/**
	 * Method to get User profile
	 * 
	 * @return GetUserProfileResponse
	 * @throws ProfileException
	 * @throws JsonProcessingException
	 */
	@PostMapping(value = "/getUserProfile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public GetUserProfileResponse getUserProfile(
			@RequestBody UserDetailsRequest userDetailsRequest) throws ProfileException, JsonProcessingException {

		GetUserProfileResponse getUserProfileResponse = new GetUserProfileResponse();
		validationService.validateGetUserProfileRequest(userDetailsRequest);
		getUserProfileResponse = profileValidatorService.getUserProfile(userDetailsRequest);
		return getUserProfileResponse;
	}
}