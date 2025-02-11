package com.demo.auth.profilevalidator.configuration;

/**
 * ProfileValidator Swagger Config class
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ProfileValidatorSwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.demo.auth.profilevalidator.controller"))
				.paths(PathSelectors.regex("/.*"))

				.build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Profile Validator API", " ", "1.0", "", "", "", null);
		return apiInfo;
	}

}
