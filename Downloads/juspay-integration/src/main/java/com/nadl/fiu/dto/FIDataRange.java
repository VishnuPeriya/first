package com.nadl.fiu.dto;

public class FIDataRange {

	private String from;

	
	public FIDataRange(String fromDate, String toDate) {
		// TODO Auto-generated constructor stub
		this.from=fromDate;
		this.to=toDate;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	private String to;
public FIDataRange() {
	// TODO Auto-generated constructor stub
}

}
