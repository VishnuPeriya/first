package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualReturnValue  extends BaseReturnValue{
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "object")
	private String object;

	@XmlElement(name = "created_on")
	@JsonProperty("created_on")
	private String createdOn;

	@XmlElement(name = "modified_on")
	@JsonProperty("modified_on")
	private String modifiedOn;

	@XmlElement(name = "first_name")
	@JsonProperty("first_name")
	private String firstName;

	@XmlElement(name = "middle_name")
	@JsonProperty("middle_name")
	private String middleName;

	@XmlElement(name = "last_name")
	@JsonProperty("last_name")
	private String lastName;

	@XmlElement(name = "dob")
	private String dob;

	@XmlElement(name = "company_name")
	@JsonProperty("comapany_name")
	private String comapanyName;

	@XmlElement(name = "date_of_incorporation")
	@JsonProperty("date_of_incorporation")
	private String dateOfIncorporation;

	@XmlElement(name = "corporate_identity_number")
	@JsonProperty("corporate_identity_number")
	private String corporateIdentityNumber;

	@XmlElement(name = "mobile_no")
	@JsonProperty("mobile_no")
	private String mobileNo;

	@XmlElement(name = "email_ID")
	@JsonProperty("email_ID")
	private String emailID;

	@XmlElement(name = "is_email_activated")
	@JsonProperty("is_email_activated")
	private int isEmailActivated;

	@XmlElement(name = "vua")
	private String vua;

	@XmlElement(name = "OVDs")
	private List<String> OVDs;

	@XmlElement(name = "status")
	private CustomerStatus status;

	@XmlElement(name = "rejections")
	private List<RejectionResponse> rejections;

	@XmlElement(name = "agreed_terms_and_conditions")
	@JsonProperty("agreed_terms_and_conditions")
	private List<String> agreedTermsAndConditions;

	@XmlElement(name = "pending_terms_and_conditions")
	@JsonProperty("pending_terms_and_conditions")
	private List<String> pendingTermsAndConditions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getComapanyName() {
		return comapanyName;
	}

	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}

	public String getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(String dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getCorporateIdentityNumber() {
		return corporateIdentityNumber;
	}

	public void setCorporateIdentityNumber(String corporateIdentityNumber) {
		this.corporateIdentityNumber = corporateIdentityNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getIsEmailActivated() {
		return isEmailActivated;
	}

	public void setIsEmailActivated(int i) {
		this.isEmailActivated = i;
	}

	public String getVua() {
		return vua;
	}

	public void setVua(String vua) {
		this.vua = vua;
	}

	public List<String> getOVDs() {
		return OVDs;
	}

	public void setOVDs(List<String> list) {
		OVDs = list;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public List<RejectionResponse> getRejections() {
		return rejections;
	}

	public void setRejections(List<RejectionResponse> rejections) {
		this.rejections = rejections;
	}

	public List<String> getAgreedTermsAndConditions() {
		return agreedTermsAndConditions;
	}

	public void setAgreedTermsAndConditions(List<String> agreedTermsAndConditions) {
		this.agreedTermsAndConditions = agreedTermsAndConditions;
	}

	public List<String> getPendingTermsAndConditions() {
		return pendingTermsAndConditions;
	}

	public void setPendingTermsAndConditions(List<String> pendingTermsAndConditions) {
		this.pendingTermsAndConditions = pendingTermsAndConditions;
	}

}
