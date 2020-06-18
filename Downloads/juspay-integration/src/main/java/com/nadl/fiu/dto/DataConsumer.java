package com.nadl.fiu.dto;

public class DataConsumer {
	private String id;

	private String type;

	public DataConsumer(String consentRecipientId, String object) {
		// TODO Auto-generated constructor stub
		this.id=consentRecipientId;
		this.type=object;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

public DataConsumer() {
	// TODO Auto-generated constructor stub
}
}
