package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.nadl.fiu.dto.CustomerStatus;
import com.nadl.fiu.dto.CustomerType;
@Entity
@Table(name = "customers")
public class Customers {
	

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "customer_id", nullable = false)
	private String customerId;

	@Column(name = "account_ref_id")
	private String accountRefId;

	@Column(name = "subject_id")
	private String subjectId;

	@Column(name = "customer_type")
	@Enumerated(EnumType.STRING)
	private CustomerType customerType;

	@Column(name = "mobile")
	private String mobileNo;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "mobile_validation_id")
	private String mobileValidationId;

	@Column(name = "is_mobile_validated")
	private int isMobileValidated;

	@Column(name = "is_email_validated")
	private int isEmailValidated;

	@Column(name = "pan")
	private String pan;

	@Column(name = "vua")
	private String vua;

	@Column(name = "okyc_id")
	private String okycId;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private CustomerStatus status;

	@Column(name = "is_blocked")
	private int isBlocked;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountRefId() {
		return accountRefId;
	}

	public void setAccountRefId(String accountRefId) {
		this.accountRefId = accountRefId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
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

	public String getMobileValidationId() {
		return mobileValidationId;
	}

	public void setMobileValidationId(String mobileValidationId) {
		this.mobileValidationId = mobileValidationId;
	}

	public int isMobileValidated() {
		return isMobileValidated;
	}

	public void setMobileValidated(int isMobileValidated) {
		this.isMobileValidated = isMobileValidated;
	}

	public int isEmailValidated() {
		return isEmailValidated;
	}

	public void setEmailValidated(int isEmailValidated) {
		this.isEmailValidated = isEmailValidated;
	}

	public String getVua() {
		return vua;
	}

	public void setVua(String vua) {
		this.vua = vua;
	}

	public String getOkycId() {
		return okycId;
	}

	public void setOkycId(String okycId) {
		this.okycId = okycId;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public int getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(int isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountRefId=" + accountRefId + ", subjectId=" + subjectId + ", customerType=" + customerType + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", mobileValidationId=" + mobileValidationId + ", isMobileValidated=" + isMobileValidated + ", isEmailValidated=" + isEmailValidated + ", pan=" + pan + ", vua=" + vua
				+ ", okycId=" + okycId + ", status=" + status + ", isBlocked=" + isBlocked + ", isDeleted=" + isDeleted + "]";
	}

	public void createAndUpdateTime() {
		// TODO Auto-generated method stub
		
	}


}
