package com.nadl.fiu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nadl.fiu.dto.Accsubtype;
import com.nadl.fiu.dto.LinkStatus;
import com.nadl.fiu.dto.Typeid;

@Entity
@Table(name="accounts")
public class AccountModel {

	@Column(name="accid")
	@Id
	private String accid;
	@Column(name="refnumber")
	private String refnumber;
	@Column(name="maskedaccnumber")
	private String maskedaccnumber;
	@Enumerated(EnumType.STRING)
	private Typeid typeid;
	@Enumerated(EnumType.STRING)
	private Accsubtype accsubtype;

	public String getAccid() {
		return accid;
	}
	public void setAccid(String accid) {
		this.accid = accid;
	}
	public String getRefnumber() {
		return refnumber;
	}
	public void setRefnumber(String refnumber) {
		this.refnumber = refnumber;
	}
	public String getMaskedaccnumber() {
		return maskedaccnumber;
	}
	public void setMaskedaccnumber(String maskedaccnumber) {
		this.maskedaccnumber = maskedaccnumber;
	}
	public Typeid getTypeid() {
		return typeid;
	}
	public void setTypeid(Typeid typeid) {
		this.typeid = typeid;
	}
	public Accsubtype getAccsubtype() {
		return accsubtype;
	}
	public void setAccsubtype(Accsubtype accsubtype) {
		this.accsubtype = accsubtype;
	}
	public LinkStatus getLinkstatus() {
		return linkstatus;
	}
	public void setLinkstatus(LinkStatus linkstatus) {
		this.linkstatus = linkstatus;
	}
	@Enumerated(EnumType.STRING)
	private LinkStatus linkstatus;
	
	public AccountModel() {
		// TODO Auto-generated constructor stub
	}
}
