package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.nadl.fiu.dto.FIRequestStatusEnums;
@Entity
@Table(name = "fi_request")
public class FIRequestModel {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "request_id", nullable = false)
	private String requestId;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "timestamp")
	private String timestamp;

	@Column(name = "txn_id")
	private String txnId;

	@Column(name = "consent_id")
	private String consentId;

	@Column(name = "session_id")
	private String sessionId;

	@Column(name = "digital_signature")
	private String digitalSignature;

	@Column(name = "fi_datarange_from")
	private String fiDatarangeFrom;

	@Column(name = "fi_datarange_to")
	private String fiDatarangeTo;

	@Column(name = "crypto_alg")
	private String cryptoAlg;

	@Column(name = "curve")
	private String curve;

	@Column(name = "params")
	private String params;

	@Column(name = "dh_publickey_expiry")
	private String dhPublickeyExpiry;

	@Column(name = "dh_publickey_parameters")
	private String dhPublickeyParameters;

	@Column(name = "dh_publickey_keyvalue")
	private String dhPublickeyKeyvalue;

	@Column(name = "nonce")
	private String nonce;

	@Column(name = "signature")
	private String signature;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private FIRequestStatusEnums status;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
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

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public String getFiDatarangeFrom() {
		return fiDatarangeFrom;
	}

	public void setFiDatarangeFrom(String fiDatarangeFrom) {
		this.fiDatarangeFrom = fiDatarangeFrom;
	}

	public String getFiDatarangeTo() {
		return fiDatarangeTo;
	}

	public void setFiDatarangeTo(String fiDatarangeTo) {
		this.fiDatarangeTo = fiDatarangeTo;
	}

	public String getCryptoAlg() {
		return cryptoAlg;
	}

	public void setCryptoAlg(String cryptoAlg) {
		this.cryptoAlg = cryptoAlg;
	}

	public String getCurve() {
		return curve;
	}

	public void setCurve(String curve) {
		this.curve = curve;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getDhPublickeyExpiry() {
		return dhPublickeyExpiry;
	}

	public void setDhPublickeyExpiry(String dhPublickeyExpiry) {
		this.dhPublickeyExpiry = dhPublickeyExpiry;
	}

	public String getDhPublickeyParameters() {
		return dhPublickeyParameters;
	}

	public void setDhPublickeyParameters(String dhPublickeyParameters) {
		this.dhPublickeyParameters = dhPublickeyParameters;
	}

	public String getDhPublickeyKeyvalue() {
		return dhPublickeyKeyvalue;
	}

	public void setDhPublickeyKeyvalue(String dhPublickeyKeyvalue) {
		this.dhPublickeyKeyvalue = dhPublickeyKeyvalue;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public FIRequestStatusEnums getStatus() {
		return status;
	}

	public void setStatus(FIRequestStatusEnums status) {
		this.status = status;
	}
	
	


}
