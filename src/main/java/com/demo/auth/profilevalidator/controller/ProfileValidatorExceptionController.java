package com.demo.auth.profilevalidator.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.soap.SOAPException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.auth.profilevalidator.exception.ProfileException;
import com.demo.auth.profilevalidator.helper.ProfileValidatorConstants;
import com.demo.auth.profilevalidator.model.ExceptionResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * ProfileValidator Exception Controller class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@ControllerAdvice
public class ProfileValidatorExceptionController {
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final Exception exception,
			final HttpServletRequest request) {

		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setErrorCode(ProfileValidatorConstants.INTERNAL_SERVER_ERROR);
		error.callerURL(request.getRequestURI());
		return error;
	}

	@ExceptionHandler(ProfileException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleResourceNotFound(final ProfileException exception,
			final HttpServletRequest request) {

		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getErrorMessage());
		error.setErrorCode(exception.getErrorCode());
		error.callerURL(request.getRequestURI());

		return error;
	}

	@ExceptionHandler(JsonProcessingException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponse handleJsonParsingException(final ProfileException exception,
			final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(ProfileValidatorConstants.PARSING_EXCEPTION_MSG);
		error.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		error.callerURL(request.getRequestURI());

		return error;
	}
	

	@ExceptionHandler(IOException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleIOException(final IOException exception,
			final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setErrorCode(ProfileValidatorConstants.INTERNAL_SERVER_ERROR);
		error.callerURL(request.getRequestURI());
		return error;
	}
	
	@ExceptionHandler(MalformedURLException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleMalformedURLException(final MalformedURLException exception,
			final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setErrorCode(ProfileValidatorConstants.INTERNAL_SERVER_ERROR);
		error.callerURL(request.getRequestURI());
		return error;
	}

	
}
