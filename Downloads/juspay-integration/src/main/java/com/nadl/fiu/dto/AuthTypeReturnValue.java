package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AuthTypeReturnValue {
	@XmlElement(name = "role")
	private RolesReturnValue roles;

	

	private List<ApikeyReturnValue> apiKeys;

	@XmlElement(name = "password")
	private PasswordReturnValue password;


	private MpinReturnValue mpin;

	public List<ApikeyReturnValue> getApiKeys() {
		return apiKeys;
	}

	public void setApiKeys(List<ApikeyReturnValue> apiKeys) {
		this.apiKeys = apiKeys;
	}

	public RolesReturnValue getRoles() {
		return roles;
	}

	public void setRoles(RolesReturnValue roles) {
		this.roles = roles;
	}

	public PasswordReturnValue getPassword() {
		return password;
	}

	public void setPassword(PasswordReturnValue password) {
		this.password = password;
	}

	public MpinReturnValue getMpin() {
		return mpin;
	}

	public void setMpin(MpinReturnValue mpin) {
		this.mpin = mpin;
	}

}
