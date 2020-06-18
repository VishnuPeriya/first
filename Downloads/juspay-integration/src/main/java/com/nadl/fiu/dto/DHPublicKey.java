package com.nadl.fiu.dto;

public class DHPublicKey {
	
	private String expiry;

	
	private String parameters;

	private String keyValue;

	public DHPublicKey() {
		super();
	}

	public DHPublicKey(String expiry, String parameters, String keyValue) {
		super();
		this.expiry = expiry;
		this.parameters = parameters;
		this.keyValue = keyValue;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}


}
