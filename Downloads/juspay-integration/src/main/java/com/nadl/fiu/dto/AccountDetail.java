package com.nadl.fiu.dto;

public class AccountDetail {

	private String accRefNumber;
 
	private String id;
	private String maskedAccNumber;

	private LinkStatus status;

	private String accountTypeId;


	private String fipId;

	private AccTypeEnums accountType;

	private String linkRefNumber;

	public LinkStatus getStatus() {
		return status;
	}

	public void setStatus(LinkStatus status) {
		this.status = status;
	}

	public void setAccountType(AccTypeEnums accountType) {
		this.accountType = accountType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccRefNumber() {
		return accRefNumber;
	}

	public void setAccRefNumber(String accRefNumber) {
		this.accRefNumber = accRefNumber;
	}

	public String getMaskedAccNumber() {
		return maskedAccNumber;
	}

	public void setMaskedAccNumber(String maskedAccNumber) {
		this.maskedAccNumber = maskedAccNumber;
	}

	
	public String getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(String accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public AccTypeEnums getAccountType() {
		return accountType;
	}

	

	public String getLinkRefNumber() {
		return linkRefNumber;
	}

	public void setLinkRefNumber(String linkRefNumber) {
		this.linkRefNumber = linkRefNumber;
	}

	@Override
	public String toString() {
		return "AccountDetails [id=" + id + ", accRefNumber=" + accRefNumber + ", maskedAccNumber=" + maskedAccNumber + ", status=" + status + ", accountTypeId=" + accountTypeId + ", fipId=" + fipId
				+ ", accountType=" + accountType + "]";
	}

}


