package com.nadl.fiu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nadl.fiu.dto.ConsentMode;
import com.nadl.fiu.dto.ConsentStatus;
import com.nadl.fiu.dto.FetchType;
@Entity
@Table(name = "consent_request")
public class ConsentRequestModel {
	@Id
	@Column(name = "request_id", nullable = false, unique = true)
	private String requestId;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "txnId")
	private String txnId;

	@Column(name = "ver")
	private String ver;

	@Column(name = "timestamp")
	private String timestamp;

	@Column(name = "fetch_type")
	@Enumerated(EnumType.STRING)
	private FetchType fetchType;

	@Column(name = "asset_type_id")
	private String assetTypeId;

	@Column(name = "consent_mode")
	@Enumerated(EnumType.STRING)
	private ConsentMode consentMode;

	@Column(name = "consent_type")
	private String consentTypes;

	@Column(name = "consent_handle")
	private String consentHandle;

	@Column(name = "data_filter")
	private String dataFilter;

	@Column(name = "startdate")
	private String startDate;

	@Column(name = "enddate")
	private String endDate;

	@Column(name = "frequency_unit")
	private String frequencyUnit;

	@Column(name = "frequency_value")
	private int frequencyValue;

	@Column(name = "datalife_unit")
	private String DataLifeUnit;

	@Column(name = "datalife_value")
	private int DataLifeValue;

	@Column(name = "consent_recipient_id")
	private String consentRecipientId;

	@Column(name = "purpose_id")
	private String purposeId;

	@Column(name = "rejection_id")
	private String rejectionId;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private ConsentStatus status;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "fi_dataRange_from")
	private String fiDataRangeFrom;

	@Column(name = "fi_dataRange_to")
	private String fiDataRangeTo;

	@Column(name = "consentUse_logUri")
	private String consentUseLogUri;

	@Column(name = "consentUse_count")
	private int consentUseCount;

	@Column(name = "consentUse_lastUsed_date")
	private String consentUseLastUsedDate;

	@Column(name = "consent_id")
	private String consentId;

	@Column(name = "consent_request_id")
	private String consentRequestId;

	@Column(name = "digital_signature")
	private String digitalSignature;

	@Column(name = "is_deleted")
	private int isDeleted;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public FetchType getFetchType() {
		return fetchType;
	}

	public void setFetchType(FetchType fetchType) {
		this.fetchType = fetchType;
	}

	public String getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(String assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public ConsentMode getConsentMode() {
		return consentMode;
	}

	public void setConsentMode(ConsentMode consentMode) {
		this.consentMode = consentMode;
	}

	public String getConsentTypes() {
		return consentTypes;
	}

	public void setConsentTypes(String consentTypes) {
		this.consentTypes = consentTypes;
	}

	public String getConsentHandle() {
		return consentHandle;
	}

	public void setConsentHandle(String consentHandle) {
		this.consentHandle = consentHandle;
	}

	public String getDataFilter() {
		return dataFilter;
	}

	public void setDataFilter(String dataFilter) {
		this.dataFilter = dataFilter;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFrequencyUnit() {
		return frequencyUnit;
	}

	public void setFrequencyUnit(String frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}

	public String getDataLifeUnit() {
		return DataLifeUnit;
	}

	public void setDataLifeUnit(String dataLifeUnit) {
		DataLifeUnit = dataLifeUnit;
	}

	public String getConsentRecipientId() {
		return consentRecipientId;
	}

	public void setConsentRecipientId(String consentRecipientId) {
		this.consentRecipientId = consentRecipientId;
	}

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}

	public String getRejectionId() {
		return rejectionId;
	}

	public void setRejectionId(String rejectionId) {
		this.rejectionId = rejectionId;
	}

	public ConsentStatus getStatus() {
		return status;
	}

	public void setStatus(ConsentStatus status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getFiDataRangeFrom() {
		return fiDataRangeFrom;
	}

	public void setFiDataRangeFrom(String fiDataRangeFrom) {
		this.fiDataRangeFrom = fiDataRangeFrom;
	}

	public String getFiDataRangeTo() {
		return fiDataRangeTo;
	}

	public void setFiDataRangeTo(String fiDataRangeTo) {
		this.fiDataRangeTo = fiDataRangeTo;
	}

	public String getConsentUseLogUri() {
		return consentUseLogUri;
	}

	public void setConsentUseLogUri(String consentUseLogUri) {
		this.consentUseLogUri = consentUseLogUri;
	}

	public int getConsentUseCount() {
		return consentUseCount;
	}

	public void setConsentUseCount(int consentUseCount) {
		this.consentUseCount = consentUseCount;
	}

	public String getConsentUseLastUsedDate() {
		return consentUseLastUsedDate;
	}

	public void setConsentUseLastUsedDate(String consentUseLastUsedDate) {
		this.consentUseLastUsedDate = consentUseLastUsedDate;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public String getConsentRequestId() {
		return consentRequestId;
	}

	public void setConsentRequestId(String consentRequestId) {
		this.consentRequestId = consentRequestId;
	}

	public String getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getFrequencyValue() {
		return frequencyValue;
	}

	public void setFrequencyValue(int frequencyValue) {
		this.frequencyValue = frequencyValue;
	}

	public int getDataLifeValue() {
		return DataLifeValue;
	}

	public void setDataLifeValue(int dataLifeValue) {
		DataLifeValue = dataLifeValue;
	}

	@Override
	public String toString() {
		return "ConsentRequestModel [requestId=" + requestId + ", customerId=" + customerId + ", txnId=" + txnId + ", ver=" + ver + ", timestamp=" + timestamp + ", fetchType=" + fetchType
				+ ", assetTypeId=" + assetTypeId + ", consentMode=" + consentMode + ", consentTypes=" + consentTypes + ", consentHandle=" + consentHandle + ", dataFilter=" + dataFilter
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", frequencyUnit=" + frequencyUnit + ", frequencyValue=" + frequencyValue + ", DataLifeUnit=" + DataLifeUnit
				+ ", DataLifeValue=" + DataLifeValue + ", consentRecipientId=" + consentRecipientId + ", purposeId=" + purposeId + ", rejectionId=" + rejectionId + ", status=" + status + ", remarks="
				+ remarks + ", fiDataRangeFrom=" + fiDataRangeFrom + ", fiDataRangeTo=" + fiDataRangeTo + ", consentUseLogUri=" + consentUseLogUri + ", consentUseCount=" + consentUseCount
				+ ", consentUseLastUsedDate=" + consentUseLastUsedDate + ", consentId=" + consentId + ", consentRequestId=" + consentRequestId + ", digitalSignature=" + digitalSignature
				+ ", isDeleted=" + isDeleted + "]";
	}

}


