package com.nadl.fiu.dto;

import javax.xml.bind.annotation.XmlElement;

public class MpinReturnValue {
	@XmlElement(name = "isEnabled")
	private Boolean isEnabled;

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
