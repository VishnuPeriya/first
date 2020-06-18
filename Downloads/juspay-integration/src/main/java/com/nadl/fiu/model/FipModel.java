package com.nadl.fiu.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="fip")
public class FipModel {
	@Column(name="category")
	private String category;
	@Column(name="name")
	private String name;
	@Id
	@Column(name="fip_id")
	private String fip_id;
	@OneToMany(targetEntity=FipIdentifier.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fip_id",referencedColumnName="fip_id")
	//@OneToMany(fetch=FetchType.LAZY,mappedBy="fip")
	private List<FipIdentifier> identifiers;
	public String getFip_id() {
		return fip_id;
	}
	public void setFip_id(String fip_id) {
		this.fip_id = fip_id;
	}
	public List<FipIdentifier> getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(List<FipIdentifier> identifiers) {
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

	public FipModel()
	{
		
	}
	@Override
	public String toString() {
		return "FipModel [category=" + category + ", name=" + name + ", fip_id=" + fip_id + ", identifiers="
				+ identifiers + "]";
	}

}
