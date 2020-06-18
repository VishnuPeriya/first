package com.nadl.fiu.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterReq {
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
	@JsonProperty("dob")
	private String dob;

	@XmlElement(name = "mobile_no")
	@JsonProperty("mobile_no")
	private String mobileNo;

	@XmlElement(name = "email_ID")
	@JsonProperty("email_ID")
	private String emailId;

	@XmlElement(name = "vua")
	@JsonProperty("vua")
	private String vua;

	@XmlElement(name = "password")
	@JsonProperty("password")
	private String password;

	@XmlElement(name = "mpin")
	@JsonProperty("mpin")
	private String mpin;

	@XmlElement(name = "mobile_validation_ID")
	@JsonProperty("mobile_validation_ID")
	private String mobileValidationId;

	@XmlElementWrapper(name = "OVDs")
	@XmlElement(name = "OVDs")
	@JsonProperty("OVDs")
	private List<String> ovds;

	@XmlElementWrapper(name = "agreed_terms_and_conditions")
	@XmlElement(name = "agreed_terms_and_conditions")
	@JsonProperty("agreed_terms_and_conditions")
	private List<String> agreedTermsAndConditions;

	@XmlElement(name = "invite_token")
	@JsonProperty("invite_token")
	private String inviteToken;

	@XmlElement(name = "customer_Id")
	@JsonProperty("customer_Id")
	private String customerId;

	@XmlElement(name = "status")
	@JsonProperty("status")
	private CustomerStatus status;

	@XmlElement(name = "OKYC_ID")
	@JsonProperty("OKYC_ID")
	private String okycId;

	private String subjectId;

	public String getOkycId() {
		return okycId;
	}

	public void setOkycId(String okycId) {
		this.okycId = okycId;
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

	public String getVua() {
		return vua;
	}

	public void setVua(String vua) {
		this.vua = vua;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMpin() {
		return mpin;
	}

	public void setMpin(String mpin) {
		this.mpin = mpin;
	}

	public String getMobileValidationId() {
		return mobileValidationId;
	}

	public void setMobileValidationId(String mobileValidationId) {
		this.mobileValidationId = mobileValidationId;
	}

	public List<String> getOvds() {
		return ovds;
	}

	public void setOvds(List<String> ovds) {
		this.ovds = ovds;
	}

	public List<String> getAgreedTermsAndConditions() {
		return agreedTermsAndConditions;
	}

	public void setAgreedTermsAndConditions(List<String> agreedTermsAndConditions) {
		this.agreedTermsAndConditions = agreedTermsAndConditions;
	}

	public String getInviteToken() {
		return inviteToken;
	}

	public void setInviteToken(String inviteToken) {
		this.inviteToken = inviteToken;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "CustomerRequest [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob=" + dob + ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", vua=" + vua
				+ ", password=" + password + ", mpin=" + mpin + ", mobileValidationId=" + mobileValidationId + ", ovds=" + ovds + ", agreedTermsAndConditions=" + agreedTermsAndConditions
				+ ", inviteToken=" + inviteToken + ", customerId=" + customerId + ", status=" + status + ", okycId=" + okycId + "]";
	}

}
