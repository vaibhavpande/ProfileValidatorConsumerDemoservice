package com.demo.auth.profilevalidator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.demo.auth.profilevalidator.configuration.ProfileValidatorEnvConfiguration;
import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.helper.ProfileValidatorConstants;
import com.demo.auth.profilevalidator.model.UserDetailsResponse;
import com.demo.auth.profilevalidator.model.UserProfileRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Dao Implementation for profile service
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@Repository
public class ProfileDaoImpl implements ProfileDao {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ProfileValidatorEnvConfiguration environmentConfig;

	/**
	 * Method to fetch User Profile
	 * 
	 * @param userProfileRequest
	 * @return userDetailsResponse
	 * @throws JsonProcessingException
	 * @throws ProfileException
	 */
	@Override
	public UserDetailsResponse fetcheUserProfile(UserProfileRequest userProfileRequest)
			throws JsonProcessingException, ProfileException {
		UserDetailsResponse userDetailsResponse = null;
		if (null == userDetailsResponse) {
			HttpHeaders header = new HttpHeaders();
			header.setContentType(MediaType.APPLICATION_JSON);
			ObjectMapper mapper = new ObjectMapper();
			String jsonRequest = mapper.writeValueAsString(userProfileRequest);
			HttpEntity<?> entity = new HttpEntity<>(jsonRequest, header);
			try {
				final ResponseEntity<UserDetailsResponse> responseBody = restTemplate.exchange(
						environmentConfig.getGetProfileURL(), HttpMethod.POST, entity, UserDetailsResponse.class);
				userDetailsResponse = responseBody.getBody();
				if (null != userDetailsResponse) {
					if (null != userDetailsResponse.getErrorCode())
						throw new ProfileException(userDetailsResponse.getErrorCode(),
								userDetailsResponse.getErrorDescription());
				}
			} catch (Exception e) {
				throw new ProfileException(ProfileValidatorConstants.ERROR_CODE_400, e.getMessage());
			}

		}
		return userDetailsResponse;
	}

}
