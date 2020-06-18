package com.nadl.fiu.dto;

public class Account {
	private FITypeEnums fiType;

	
	private String fipId;

	
	private AccTypeEnums accType;

	
	private String accRefNumber;

	
	private String linkRefNumber;

	
	public FITypeEnums getFiType() {
		return fiType;
	}


	public void setFiType(FITypeEnums fiType) {
		this.fiType = fiType;
	}


	public String getFipId() {
		return fipId;
	}


	public void setFipId(String fipId) {
		this.fipId = fipId;
	}


	public AccTypeEnums getAccType() {
		return accType;
	}


	public void setAccType(AccTypeEnums accType) {
		this.accType = accType;
	}


	public String getAccRefNumber() {
		return accRefNumber;
	}


	public void setAccRefNumber(String accRefNumber) {
		this.accRefNumber = accRefNumber;
	}


	public String getLinkRefNumber() {
		return linkRefNumber;
	}


	public void setLinkRefNumber(String linkRefNumber) {
		this.linkRefNumber = linkRefNumber;
	}


	public String getMaskedAccNumber() {
		return maskedAccNumber;
	}


	public void setMaskedAccNumber(String maskedAccNumber) {
		this.maskedAccNumber = maskedAccNumber;
	}


	private String maskedAccNumber;


}
