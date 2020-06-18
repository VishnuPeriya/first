package com.nadl.fiu.dto;

import java.util.List;

public class ConsentResponse {
	
	
	private String version;

	private String transactionId;

	private String createTimeStamp;

	private String consentId;


	private ConsentStatus status;

	private String consentHandle;

	private ConsentDetail consentDetail;

	private String consentDetailDigitalSignature;

	private ConsentUse consentUse;

	private ConsentArtefacts consentArtefacts;

	public ConsentArtefacts getConsentArtefacts() {
		return consentArtefacts;
	}

	public void setConsentArtefacts(ConsentArtefacts consentArtefacts) {
		this.consentArtefacts = consentArtefacts;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}



	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public ConsentStatus getStatus() {
		return status;
	}

	public void setStatus(ConsentStatus status) {
		this.status = status;
	}

	public String getConsentHandle() {
		return consentHandle;
	}

	public void setConsentHandle(String consentHandle) {
		this.consentHandle = consentHandle;
	}

	public ConsentDetail getConsentDetail() {
		return consentDetail;
	}

	public void setConsentDetail(ConsentDetail consentDetail) {
		this.consentDetail = consentDetail;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(String createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getConsentDetailDigitalSignature() {
		return consentDetailDigitalSignature;
	}

	public void setConsentDetailDigitalSignature(String consentDetailDigitalSignature) {
		this.consentDetailDigitalSignature = consentDetailDigitalSignature;
	}

	public ConsentUse getConsentUse() {
		return consentUse;
	}

	public void setConsentUse(ConsentUse consentUse) {
		this.consentUse = consentUse;
	}

	@Override
	public String toString() {
		return "ApprovedConsentResponse [version=" + version + ", transactionId=" + transactionId + ", createTimeStamp=" + createTimeStamp + ", consentId=" + consentId + ", status=" + status
				+ ", consentHandle=" + consentHandle + ", consentDetail=" + consentDetail + ", consentDetailDigitalSignature=" + consentDetailDigitalSignature + ", consentUse=" + consentUse
				+ ", consentArtefacts=" + consentArtefacts + "]";
	}

}



