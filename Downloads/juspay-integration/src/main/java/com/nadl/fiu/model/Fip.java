package com.nadl.fiu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "fip_model")
public class Fip {
	
	@Id
	@Column(name = "fip_id", nullable = false)
	private String fipId;

	@Column(name = "name")
	private String name;

	@Column(name = "incorporation_date")
	private Date incorporationDate;

	@Column(name = "reg_address")
	private String regAddress;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private String pinCode;

	@Column(name = "phone")
	private String phone;

	@Column(name = "emailid")
	private String emailId;

	@Column(name = "digital_signature")
	private String digitalSignature;

	@Column(name = "vua")
	private String vua;

	@Column(name = "rebit_base_api_url")
	private String rebitBaseApiUrl;

	@Column(name = "logo_id")
	private String logoId;

	@Column(name = "is_blocked")
	private int isBlocked;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getFipId() {
		return fipId;
	}

	public void setFipId(String fipId) {
		this.fipId = fipId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public String getVua() {
		return vua;
	}

	public void setVua(String vua) {
		this.vua = vua;
	}

	public String getRebitBaseApiUrl() {
		return rebitBaseApiUrl;
	}

	public void setRebitBaseApiUrl(String rebitBaseApiUrl) {
		this.rebitBaseApiUrl = rebitBaseApiUrl;
	}

	public String getLogoId() {
		return logoId;
	}

	public void setLogoId(String logoId) {
		this.logoId = logoId;
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

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "FipModel [fipId=" + fipId + ", name=" + name + ", incorporationDate=" + incorporationDate + ", regAddress=" + regAddress + ", state=" + state + ", pinCode=" + pinCode + ", phone="
				+ phone + ", emailId=" + emailId + ", digitalSignature=" + digitalSignature + ", vua=" + vua + ", rebitBaseApiUrl=" + rebitBaseApiUrl + ", logoId=" + logoId + ", isBlocked="
				+ isBlocked + ", isDeleted=" + isDeleted + "]";
	}
	
	


}
