package com.nadl.fiu.dto;

public class Consents {
	
	String status;
	String consenthandle;
	String consentid;
	ConsentDetail consentdetail;
	String createtimestamp;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConsenthandle() {
		return consenthandle;
	}
	public void setConsenthandle(String consenthandle) {
		this.consenthandle = consenthandle;
	}
	public String getConsentid() {
		return consentid;
	}
	public void setConsentid(String consentid) {
		this.consentid = consentid;
	}
	public ConsentDetail getConsentdetail() {
		return consentdetail;
	}
	public void setConsentdetail(ConsentDetail consentdetail) {
		this.consentdetail = consentdetail;
	}
	public String getCreatetimestamp() {
		return createtimestamp;
	}
	public void setCreatetimestamp(String createtimestamp) {
		this.createtimestamp = createtimestamp;
	}
	

}
