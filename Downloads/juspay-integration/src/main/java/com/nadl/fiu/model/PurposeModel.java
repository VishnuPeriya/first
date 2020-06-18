package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purpose")
public class PurposeModel {
	@Id
	@Column(name = "purpose_id", nullable = false)
	private String purposeId;

	@Column(name = "code")
	private String code;

	@Column(name = "text")
	private String text;

	@Column(name = "ref_uri")
	private String refUri;

	@Column(name = "category_type")
	private String categoryType;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
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

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}

	


