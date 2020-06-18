package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RolesReturnValue {
	@XmlElement(name="role")
	 private List<String> roles;

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
