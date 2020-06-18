package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "consent_artefact")
public class ConsentArtefactModel {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "artefact_id", nullable = false, unique = true)
	private String artefactId;

	@Column(name = "consent_id")
	private String consentId;

	@Column(name = "txn_id")
	private String txnId;

	@Column(name = "fip_id")
	private String fipId;

	@Column(name = "digital_signature")
	private String digitalSignature;

	@Column(name = "artefact_status")
	private String artefactStatus;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getArtefactId() {
		return artefactId;
	}

	public void setArtefactId(String artefactId) {
		this.artefactId = artefactId;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public String getArtefactStatus() {
		return artefactStatus;
	}

	public void setArtefactStatus(String artefactStatus) {
		this.artefactStatus = artefactStatus;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "ConsentArtefactModel [artefactId=" + artefactId + ", consentId=" + consentId + ", txnId=" + txnId + ", fipId=" + fipId + ", digitalSignature=" + digitalSignature + ", artefactStatus="
				+ artefactStatus + ", isDeleted=" + isDeleted + "]";
	}

}



