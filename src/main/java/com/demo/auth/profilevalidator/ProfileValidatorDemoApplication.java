package com.demo.auth.profilevalidator;

/**
 * Main method for Profile Validator Consumer Service spring boot application
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ProfileValidatorDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProfileValidatorDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProfileValidatorDemoApplication.class);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
