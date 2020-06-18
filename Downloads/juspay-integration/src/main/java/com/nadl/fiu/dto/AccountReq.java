package com.nadl.fiu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountReq {
	@JsonProperty("fip_id")
	private String fipId;
	@JsonProperty("accounts")
	private List<String> accountIds;
	public String getFipId() {
		return fipId;
	}
	public void setFipId(String fipId) {
		this.fipId = fipId;
	}
	public List<String> getAccountIds() {
		return accountIds;
	}
	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}
public AccountReq() {
	// TODO Auto-generated constructor stub
}
}
