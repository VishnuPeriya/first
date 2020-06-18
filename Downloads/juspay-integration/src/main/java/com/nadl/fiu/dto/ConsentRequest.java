package com.nadl.fiu.dto;

public class ConsentRequest {
	private String version;
	private String timestamp;
	private String txnid;
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

	public String getTxnid() {
		return txnid;
	}

	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}

	private ConsentDetail consentdetail;
	private String mobileNo;

	private String emailId;

	private String endUserId;
	private ConsentAction status;

	public ConsentDetail getConsentdetail() {
		return consentdetail;
	}

	public void setConsentdetail(ConsentDetail consentdetail) {
		this.consentdetail = consentdetail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEndUserId() {
		return endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
	}

	public ConsentAction getStatus() {
		return status;
	}

	public void setStatus(ConsentAction status) {
		this.status = status;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	private String consentId;

}
