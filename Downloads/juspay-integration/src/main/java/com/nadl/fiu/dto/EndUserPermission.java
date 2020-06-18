package com.nadl.fiu.dto;

import java.util.HashMap;
import java.util.Map;

public enum EndUserPermission {
createConsent(1, "create:Consent"), approveConsent(2, "approve:Consent"), createEndUser(3, "create:EndUser");
	
	private final int key;

	private final String value;

	private static Map<Integer, EndUserPermission> authMap;

	private EndUserPermission(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static EndUserPermission getValue(int key) {
		if (authMap == null)
			initMapping();
		return authMap.get(key);
	}

	private static void initMapping() {
		authMap = new HashMap<>();
		for (EndUserPermission s : values())
			authMap.put(s.key, s);
	}
	
}
