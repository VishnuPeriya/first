package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "consent_approve")
public class ConsentApproveModel {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "approve_id", nullable = false, unique = true)
	private String approveId;

	@Column(name = "artefact_id")
	private String artefactId;

	@Column(name = "account_id")
	private String accountId;

	@Column(name = "account_status")
	private String accountStatus;

	@Column(name = "fip_id")
	private String fipId;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getApproveId() {
		return approveId;
	}

	public void setApproveId(String approveId) {
		this.approveId = approveId;
	}

	public String getArtefactId() {
		return artefactId;
	}

	public void setArtefactId(String artefactId) {
		this.artefactId = artefactId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "ConsentApproveModel [approveId=" + approveId + ", artefactId=" + artefactId + ", accountId=" + accountId + ", accountStatus=" + accountStatus + ", fipId=" + fipId + ", isDeleted="
				+ isDeleted + "]";
	}

}



