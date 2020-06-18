package com.nadl.fiu.dto;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RejectionResponse {
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "object")
	private String object;

	@XmlElement(name = "created_on")
	private String createdOn;

	@XmlElement(name = "modified_on")
	private String modifiedOn;

	@XmlElement(name = "attribute")
	private String attribute;

	@XmlElement(name = "reason")
	private String reason;

	@XmlElement(name = "resource_type")
	private String resourceType;

	@XmlElement(name = "resource_ID")
	private String resourceId;

	@XmlElement(name = "task_ID")
	private String taskId;

	@XmlElement(name = "has_response")
	private boolean hasResponse;

	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	@JsonProperty("object")
	public void setObject(String object) {
		this.object = object;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	@JsonProperty("created_on")
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	@JsonProperty("modified_on")
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getAttribute() {
		return attribute;
	}

	@JsonProperty("attribute")
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getReason() {
		return reason;
	}

	@JsonProperty("reason")
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResourceType() {
		return resourceType;
	}

	@JsonProperty("resource_type")
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceId() {
		return resourceId;
	}

	@JsonProperty("resource_ID")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getTaskId() {
		return taskId;
	}

	@JsonProperty("task_ID")
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public boolean isHasResponse() {
		return hasResponse;
	}

	@JsonProperty("has_response")
	public void setHasResponse(boolean hasResponse) {
		this.hasResponse = hasResponse;
	}

}
