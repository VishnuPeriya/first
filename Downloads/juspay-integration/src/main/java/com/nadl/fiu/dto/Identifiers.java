package com.nadl.fiu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identifiers {
	@JsonProperty("category")
	CategoryEnum category;
	@JsonProperty("type")
	TypeEnum type;
	public CategoryEnum getCategory() {
		return category;
	}
	public void setCategory(CategoryEnum category) {
		this.category = category;
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum type) {
		this.type = type;
	}
	
}
