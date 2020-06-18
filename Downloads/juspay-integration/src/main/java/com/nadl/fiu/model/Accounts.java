package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nadl.fiu.dto.AccTypeEnums;
import com.nadl.fiu.dto.AuthenticatorTypeEnums;
import com.nadl.fiu.dto.FITypeEnums;
import com.nadl.fiu.dto.LinkStatus;
@Entity
@Table(name = "account_model")
public class Accounts {
	@Id
	@Column(name = "account_id", nullable = false)
	private String accountId;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "customer_type")
	private String customerType;

	@Column(name = "fip_id")
	private String fipId;

	@Enumerated(EnumType.STRING)
	@Column(name = "type_id", nullable = false)
	private FITypeEnums typeId;

	@Enumerated(EnumType.STRING)
	@Column(name = "sub_type_id", nullable = false)
	private AccTypeEnums subTypeId;

	@Column(name = "account_link_status")
	@Enumerated(EnumType.STRING)
	private LinkStatus accountLinkStatus;

	@Column(name = "account_ref_number")
	private String accountRefNumber;

	@Column(name = "account_masked_number")
	private String accountMaskedNumber;

	@Column(name = "authenticator_type")
	@Enumerated(EnumType.STRING)
	private AuthenticatorTypeEnums authenticatorType;

	@Column(name = "link_reference_number")
	private String linkReferenceNumber;

	@Column(name = "link_txn_id")
	private String linkTxnId;

	@Column(name = "confirm_txn_id")
	private String confirmTxnId;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public FITypeEnums getTypeId() {
		return typeId;
	}

	public void setTypeId(FITypeEnums typeId) {
		this.typeId = typeId;
	}

	public AccTypeEnums getSubTypeId() {
		return subTypeId;
	}

	public void setSubTypeId(AccTypeEnums subTypeId) {
		this.subTypeId = subTypeId;
	}

	

	public LinkStatus getAccountLinkStatus() {
		return accountLinkStatus;
	}

	public void setAccountLinkStatus(LinkStatus accountLinkStatus) {
		this.accountLinkStatus = accountLinkStatus;
	}

	public String getAccountRefNumber() {
		return accountRefNumber;
	}

	public void setAccountRefNumber(String accountRefNumber) {
		this.accountRefNumber = accountRefNumber;
	}

	public String getAccountMaskedNumber() {
		return accountMaskedNumber;
	}

	public void setAccountMaskedNumber(String accountMaskedNumber) {
		this.accountMaskedNumber = accountMaskedNumber;
	}

	public AuthenticatorTypeEnums getAuthenticatorType() {
		return authenticatorType;
	}

	public void setAuthenticatorType(AuthenticatorTypeEnums authenticatorType) {
		this.authenticatorType = authenticatorType;
	}

	public String getLinkReferenceNumber() {
		return linkReferenceNumber;
	}

	public void setLinkReferenceNumber(String linkReferenceNumber) {
		this.linkReferenceNumber = linkReferenceNumber;
	}

	public String getLinkTxnId() {
		return linkTxnId;
	}

	public void setLinkTxnId(String linkTxnId) {
		this.linkTxnId = linkTxnId;
	}

	public String getConfirmTxnId() {
		return confirmTxnId;
	}

	public void setConfirmTxnId(String confirmTxnId) {
		this.confirmTxnId = confirmTxnId;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}


