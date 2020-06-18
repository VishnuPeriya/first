package com.nadl.fiu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Fips {
	@JsonProperty("Identifiers")
	List<Identifiers> identifiers;
	@JsonProperty("category")
	String category;
	@JsonProperty("name")
	String name;
	@JsonProperty("id")
	String id;
	public List<Identifiers> getIdentifiers() {
		return identifiers;
	}
	@Override
	public String toString() {
		return "Fips [identifiers=" + identifiers + ", category=" + category + ", name=" + name + ", id=" + id + "]";
	}
	public void setIdentifiers(List<Identifiers> identifiers) {
		this.identifiers = identifiers;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
