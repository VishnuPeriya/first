package com.nadl.fiu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nadl.fiu.model.Customer;

public class CustomerSave {
	@JsonProperty("sessionTocken") 
	private String sessionTocken;
	@JsonProperty("customerInfo")
	private Customer customerInfo;
	public String getSessionTocken() {
		return sessionTocken;
	}
	public void setSessionTocken(String sessionTocken) {
		this.sessionTocken = sessionTocken;
	}
	public Customer getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}
	@Override
	public String toString() {
		return "CustomerSave [sessionTocken=" + sessionTocken + ", customerInfo=" + customerInfo
				+ ", getSessionTocken()=" + getSessionTocken() + ", getCustomerInfo()=" + getCustomerInfo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
