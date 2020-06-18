package com.nadl.fiu.dto;

public class DataLife {
	
	private DataLifeUnit unit;

	public DataLifeUnit getUnit() {
		return unit;
	}

	public void setUnit(DataLifeUnit unit) {
		this.unit = unit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private int value;
public DataLife() {
	// TODO Auto-generated constructor stub
}

public DataLife(DataLifeUnit unit, int value) {
	super();
	this.unit = unit;
	this.value = value;
}
}