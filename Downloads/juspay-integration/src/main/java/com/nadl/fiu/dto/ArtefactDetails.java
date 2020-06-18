package com.nadl.fiu.dto;

public class ArtefactDetails {

	private String fipId;


	private String consentId;

	
	private String digitalSignature;

	private ConsentStatus consentStatus;

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public ConsentStatus getConsentStatus() {
		return consentStatus;
	}


}
