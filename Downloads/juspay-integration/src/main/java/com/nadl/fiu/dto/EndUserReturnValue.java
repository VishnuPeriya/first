package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class EndUserReturnValue {
	@Override
	public String toString() {
		return "EndUserReturnValue [id=" + id + ", userName=" + userName + ", object=" + object + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + ", roles=" + roles + ", authTypes=" + authTypes
				+ ", permissions=" + permissions + ", accessToken=" + accessToken + ", refreshToken=" + refreshToken
				+ "]";
	}

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "userName")
	private String userName;

	@XmlElement(name = "object")
	private String object;

	@XmlElement(name = "createdOn")
	private String createdOn;

	@XmlElement(name = "modifiedOn")
	private String modifiedOn;

	@XmlElement(name = "role")
	private List<String> roles;

	@XmlElement(name = "authType")
	private AuthTypeReturnValue authTypes;

	@XmlElement(name = "Permissions")
	private List<EndUserPermission> permissions;

	@XmlElement(name = "accessToken")
	private String accessToken;

	@XmlElement(name = "refreshToken")
	private String refreshToken;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public AuthTypeReturnValue getAuthTypes() {
		return authTypes;
	}

	public void setAuthTypes(AuthTypeReturnValue authTypes) {
		this.authTypes = authTypes;
	}

	public List<EndUserPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<EndUserPermission> permissions) {
		this.permissions = permissions;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
