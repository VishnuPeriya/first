package com.nadl.fiu.dto;

public class ConsentUse {
	private String logUri;


	public String getLogUri() {
		return logUri;
	}

	public void setLogUri(String logUri) {
		this.logUri = logUri;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getLastUseDateTime() {
		return lastUseDateTime;
	}

	public void setLastUseDateTime(String lastUseDateTime) {
		this.lastUseDateTime = lastUseDateTime;
	}

	private int count;

	private String lastUseDateTime;

}
