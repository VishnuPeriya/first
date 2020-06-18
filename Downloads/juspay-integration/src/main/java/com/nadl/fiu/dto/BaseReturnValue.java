package com.nadl.fiu.dto;

import javax.xml.bind.annotation.XmlTransient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseReturnValue {
	@JsonIgnore
	@XmlTransient
	private String referenceNo;

	@JsonIgnore
	@XmlTransient
	private String requestTime;

	@JsonIgnore
	@XmlTransient
	HttpHeaders headers;

	@JsonIgnore
	@XmlTransient
	HttpStatus httpStatus;

	public HttpHeaders getHeaders() {
		return headers;
	}

	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public BaseReturnValue() {
		super();
	}

	public BaseReturnValue(String referenceNo, String requestTime) {
		super();
		this.referenceNo = referenceNo;
		this.requestTime = requestTime;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
