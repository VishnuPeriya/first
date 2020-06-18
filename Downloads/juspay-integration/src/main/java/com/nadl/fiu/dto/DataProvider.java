package com.nadl.fiu.dto;

public class DataProvider {
	private String id;

	private String type;

	public DataProvider(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.id=string;
		this.type=string2;
	}

	public DataProvider() {
		// TODO Auto-generated constructor stub
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

}
