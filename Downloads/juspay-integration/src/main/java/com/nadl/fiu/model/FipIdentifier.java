package com.nadl.fiu.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nadl.fiu.dto.CategoryEnum;
import com.nadl.fiu.dto.TypeEnum;
@Entity
@Table(name="fipidentifier")
public class FipIdentifier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@JsonIgnore
	private int id;
	@Enumerated(EnumType.STRING)
	private CategoryEnum category;
	@Enumerated(EnumType.STRING)
	private TypeEnum type;
	@Column(name="fip_id")
	@JsonIgnore
	private String fip_id;
	public FipIdentifier() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	
	public String getFip_id() {
		return fip_id;
	}
	public void setFip_id(String fip_id) {
		this.fip_id = fip_id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
