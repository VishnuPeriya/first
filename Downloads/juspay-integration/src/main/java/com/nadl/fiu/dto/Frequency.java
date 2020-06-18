package com.nadl.fiu.dto;

public class Frequency {
	private FrequencyUnitEnums unit;


	private int value;


	public Frequency(FrequencyUnitEnums valueOf, int frequencyValue) {
		// TODO Auto-generated constructor stub
	this.unit=valueOf;
	this.value=frequencyValue;
	}
public Frequency() {
	// TODO Auto-generated constructor stub
}

	public FrequencyUnitEnums getUnit() {
		return unit;
	}


	public void setUnit(FrequencyUnitEnums unit) {
		this.unit = unit;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


}
