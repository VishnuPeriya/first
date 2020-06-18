package com.nadl.fiu.dto;

public class DataFilter {
	private DataFilterType type;

	private String operator;

	public DataFilter(DataFilterType valueOf, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.type=valueOf;
		this.operator=string;
		this.value=string2;
	}
public DataFilter() {
	// TODO Auto-generated constructor stub
}
	public DataFilterType getType() {
		return type;
	}

	public void setType(DataFilterType type) {
		this.type = type;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;
}
