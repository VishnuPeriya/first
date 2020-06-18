package com.nadl.fiu.dto;

public class ConsentArtefacts {

	private String fip_id;
	private String id;
	private String digitalsignature;
	private String status;
	public String getFip_id() {
		return fip_id;
	}
	public void setFip_id(String fip_id) {
		this.fip_id = fip_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDigitalsignature() {
		return digitalsignature;
	}
	public void setDigitalsignature(String digitalsignature) {
		this.digitalsignature = digitalsignature;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
