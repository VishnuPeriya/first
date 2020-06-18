package com.nadl.fiu.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Column(name="fipid")
	@Id
	private String fipid;
	@JoinColumn(name="fipid",referencedColumnName="fipid")
	@OneToMany(targetEntity=DiscoveredAccount.class,cascade=CascadeType.ALL)
	private List<DiscoveredAccount> discoveredaccount;
	public Account() {
		
	}
	public String getFipid() {
		return fipid;
	}
	public void setFipid(String fipid) {
		this.fipid = fipid;
	}
	public List<DiscoveredAccount> getDiscoveredaccount() {
		return discoveredaccount;
	}
	public void setDiscoveredaccount(List<DiscoveredAccount> discoveredaccount) {
		this.discoveredaccount = discoveredaccount;
	}
	
}
