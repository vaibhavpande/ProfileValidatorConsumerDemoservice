package com.demo.auth.profilevalidator.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ProfileValidator Environment Configuration class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@Component
@ConfigurationProperties("env")
public class ProfileValidatorEnvConfiguration {

	private String getProfileURL;
	
	public String getGetProfileURL() {
		return getProfileURL;
	}

	public void setGetProfileURL(String getProfileURL) {
		this.getProfileURL = getProfileURL;
	}
}