package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class EndUserRequest {
	
	private String username;

	private List<String> roles;


	private List<EndUserAuthType> authTypes;


	private String password;

	private String mpin;

	private String accessToken;


	private String refreshToken;

	private String expiryDate;

	private String desc;

	private String validUntil;

	private String userId;

	private String authType;

	private Boolean deletePermanently;

	private String context;

	public String getMpin() {
		return mpin;
	}

	public void setMpin(String mpin) {
		this.mpin = mpin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<EndUserAuthType> getAuthTypes() {
		return authTypes;
	}

	public void setAuthTypes(List<EndUserAuthType> authTypes) {
		this.authTypes = authTypes;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Boolean getDeletePermanently() {
		return deletePermanently;
	}

	public void setDeletePermanently(Boolean deletePermanently) {
		this.deletePermanently = deletePermanently;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "EndUserRequest [username=" + username + ", roles=" + (roles != null ? roles.subList(0, Math.min(roles.size(), maxLen)) : null) + ", authTypes="
				+ (authTypes != null ? authTypes.subList(0, Math.min(authTypes.size(), maxLen)) : null) + ", password=" + password + ", mpin=" + mpin + ", accessToken=" + accessToken
				+ ", refreshToken=" + refreshToken + ", expiryDate=" + expiryDate + ", desc=" + desc + ", validUntil=" + validUntil + ", userId=" + userId + ", authType=" + authType
				+ ", deletePermanently=" + deletePermanently + ", context=" + context + "]";
	}
}
