package com.nadl.fiu.dto;

public class Consent {

	private String id;


	private String digitalSignature;

	public Consent() {
		super();
	}

	public Consent(String id, String digitalSignature) {
		super();
		this.id = id;
		this.digitalSignature = digitalSignature;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
