package com.demo.auth.profilevalidator.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Model class for User Details Response
 * 
 * @author Vaibhav
 * @version 1.0
 * 
 */
@JsonInclude(Include.NON_NULL)
public class UserDetailsResponse {

	@JsonProperty("errorCode")
	String errorCode;
	@JsonProperty("errorDescription")
	String errorDescription;
	@JsonProperty("recordCount")
	String recordCount;
	@JsonProperty("searchValue")
	String searchValue;
	@JsonProperty("userinfo")
	UserInfo userinfo[];

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public UserInfo[] getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo[] userinfo) {
		this.userinfo = userinfo;
	}

	@Override
	public String toString() {
		return "UserDetailsResponse [errorCode=" + errorCode + ", errorDescription=" + errorDescription
				+ ", recordCount=" + recordCount + ", searchValue=" + searchValue + ", userinfo="
				+ Arrays.toString(userinfo) + "]";
	}
}
