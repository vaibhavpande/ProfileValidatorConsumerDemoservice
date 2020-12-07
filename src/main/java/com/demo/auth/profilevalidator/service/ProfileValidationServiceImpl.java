package com.demo.auth.profilevalidator.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.helper.ProfileValidatorConstants;
import com.demo.auth.profilevalidator.model.UserDetailsRequest;
/**
 * Profile Service request validations class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@Component
public class ProfileValidationServiceImpl implements ProfileValidationService {

	private static String emailRegex = "^[A-Za-z0-9+_.]+@[a-zA-Z]+[.+A-Za-z]*$";

	@Override
	public void validateGetUserProfileRequest(
			UserDetailsRequest userDetailsRequest) throws ProfileException {
		if ((StringUtils.isEmpty(userDetailsRequest.getEmailAddr()))) {
			throw new ProfileException(ProfileValidatorConstants.ERROR_CODE_400,
					ProfileValidatorConstants.MISSING_MANDATORY_PARAMETER_MSG + "Email is required");
		} else {
			validateEmail(userDetailsRequest.getEmailAddr());
		}
	}

	/**
	 * Method to validate Email
	 * 
	 * @param inputEmail
	 * @throws ProfileException
	 */
	private void validateEmail(String inputEmail) throws ProfileException {
		boolean validParameter = validateParameter(emailRegex, inputEmail);
		if (!validParameter) {
			throw new ProfileException(ProfileValidatorConstants.ERROR_CODE_400,
					ProfileValidatorConstants.INVALID_REQUEST_PARAMETER_MSG + "Email");
		}

	}

	/**
	 * This method matches request parameter with corresponding regex.
	 * 
	 * @param regex
	 * @param parameter
	 * @return
	 */
	public static boolean validateParameter(String regex, final String parameter) {

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(parameter);
		return matcher.matches();
	}
}