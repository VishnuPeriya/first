package com.nadl.fiu.dto;

import java.util.List;

import com.nadl.fiu.model.Accounts;

public class ConsentDetail {
	
	
	private String consentStart;

	private String consentExpiry;

	private ConsentMode consentMode;

	private FetchType fetchType;

	private List<ConsentTypes> consentTypes;

	private List<FITypeEnums> fiTypes;


	private DataConsumer dataConsumer;

	private DataProvider dataProvider;
	private ConsentCustomer customer;

	private List<String> accountIds;

	private List<Accounts> accounts;

	private String purposeId;

	private ConsentPurpose purpose;

	private FIDataRange fiDataRange;

	private DataLife dataLife;

	private Frequency frequency;

	
	public String getConsentStart() {
		return consentStart;
	}


	public void setConsentStart(String consentStart) {
		this.consentStart = consentStart;
	}


	public String getConsentExpiry() {
		return consentExpiry;
	}


	public void setConsentExpiry(String consentExpiry) {
		this.consentExpiry = consentExpiry;
	}


	public ConsentMode getConsentMode() {
		return consentMode;
	}


	public void setConsentMode(ConsentMode consentMode) {
		this.consentMode = consentMode;
	}


	public FetchType getFetchType() {
		return fetchType;
	}


	public void setFetchType(FetchType fetchType) {
		this.fetchType = fetchType;
	}


	public List<ConsentTypes> getConsentTypes() {
		return consentTypes;
	}


	public void setConsentTypes(List<ConsentTypes> consentTypes) {
		this.consentTypes = consentTypes;
	}


	public List<FITypeEnums> getFiTypes() {
		return fiTypes;
	}


	public void setFiTypes(List<FITypeEnums> fiTypes) {
		this.fiTypes = fiTypes;
	}


	public DataConsumer getDataConsumer() {
		return dataConsumer;
	}


	public void setDataConsumer(DataConsumer dataConsumer) {
		this.dataConsumer = dataConsumer;
	}


	public DataProvider getDataProvider() {
		return dataProvider;
	}


	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}


	public ConsentCustomer getCustomer() {
		return customer;
	}


	public void setCustomer(ConsentCustomer customer) {
		this.customer = customer;
	}


	public List<String> getAccountIds() {
		return accountIds;
	}


	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}


	public List<Accounts> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}


	public String getPurposeId() {
		return purposeId;
	}


	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}


	public ConsentPurpose getPurpose() {
		return purpose;
	}


	public void setPurpose(ConsentPurpose purpose) {
		this.purpose = purpose;
	}


	public FIDataRange getFiDataRange() {
		return fiDataRange;
	}


	public void setFiDataRange(FIDataRange fiDataRange) {
		this.fiDataRange = fiDataRange;
	}


	public DataLife getDataLife() {
		return dataLife;
	}


	public void setDataLife(DataLife dataLife) {
		this.dataLife = dataLife;
	}


	public Frequency getFrequency() {
		return frequency;
	}


	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}


	public List<DataFilter> getDataFilter() {
		return dataFilter;
	}


	public void setDataFilter(List<DataFilter> dataFilter) {
		this.dataFilter = dataFilter;
	}


	private List<DataFilter> dataFilter;


	public void setDataLife(String dataLifeUnit, int dataLifeValue) {
		// TODO Auto-generated method stub
		
	}

}
