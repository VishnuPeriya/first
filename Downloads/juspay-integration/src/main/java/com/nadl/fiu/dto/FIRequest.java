package com.nadl.fiu.dto;

public class FIRequest {


	//private String id;


	private String version;


	private String timestamp;


	//private String fipId;


	private String transactionId;


	private FIDataRange fiDataRange;


	private Consent consent;


	private KeyMaterial keyMaterial;


	//private String sessionId;

	//private FIRequestStatusEnums status;

	public FIRequest() {
		super();
	}

	/*public FIRequest(String id, String version, String timestamp, String transactionId) {
		super();
		//this.id = id;
		this.version = version;
		this.timestamp = timestamp;
		this.transactionId = transactionId;
	}*/

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

	/*public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}*/

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public FIDataRange getFiDataRange() {
		return fiDataRange;
	}

	public void setFiDataRange(FIDataRange fiDataRange) {
		this.fiDataRange = fiDataRange;
	}

	public Consent getConsent() {
		return consent;
	}

	public void setConsent(Consent consent) {
		this.consent = consent;
	}

	public KeyMaterial getKeyMaterial() {
		return keyMaterial;
	}

	public void setKeyMaterial(KeyMaterial keyMaterial) {
		this.keyMaterial = keyMaterial;
	}

	/*public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}*/

	/*public FIRequestStatusEnums getStatus() {
		return status;
	}

	public void setStatus(FIRequestStatusEnums status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FIRequest [id=" + id + ", version=" + version + ", timestamp=" + timestamp + ", fipId=" + fipId
				+ ", transactionId=" + transactionId + ", fiDataRange=" + fiDataRange + ", consent=" + consent
				+ ", keyMaterial=" + keyMaterial + ", sessionId=" + sessionId + ", status=" + status + "]";
	}*/

	public Object clone() throws CloneNotSupportedException {
		FIRequest fiRequest = (FIRequest) super.clone();
		fiRequest.setConsent((Consent) consent.clone());
		return fiRequest;
	}
	
	
}
