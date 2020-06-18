package com.nadl.fiu.dto;

public class ConsentPurpose {
	
	private String purposeId;

	private ObjectEnums object;


	private String createdOn;

	
	private String modifiedOn;

	
	private String code;

	
	private String text;

	
	private String refUri;

	
	private ConsentPurposeCategory categoryType;


	public String getPurposeId() {
		return purposeId;
	}


	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}


	public ObjectEnums getObject() {
		return object;
	}


	public void setObject(ObjectEnums object) {
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


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getRefUri() {
		return refUri;
	}


	public void setRefUri(String refUri) {
		this.refUri = refUri;
	}


	public ConsentPurposeCategory getCategoryType() {
		return categoryType;
	}


	public void setCategoryType(ConsentPurposeCategory categoryType) {
		this.categoryType = categoryType;
	}

}
