package com.nadl.fiu.dto;

public class FIResponse {
	

	private String version;


	private String timestamp;


	private String transactionId;


	private String consentId;


	private String sessionId;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "FIResponse [version=" + version + ", timestamp=" + timestamp + ", transactionId=" + transactionId + ", consentId=" + consentId + ", sessionId="
				+ sessionId + "]";
	}


}
