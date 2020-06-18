package com.nadl.fiu.dto;

import javax.xml.bind.annotation.XmlElement;

public class ApikeyReturnValue {
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "key")
	private String key;

	@XmlElement(name = "desc")
	private String desc;

	@XmlElement(name = "validUntil")
	private String validUntil;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

}
