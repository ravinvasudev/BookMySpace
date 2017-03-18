package com.bms.model;

import java.io.Serializable;

import com.bms.helper.Constants.Status;

public final class AckMessage implements Serializable {

	private Status status;

	private String statusCode;

	private String description;

	public AckMessage() {

	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("AckMessage [status=%s, statusCode=%s, description=%s]", status, statusCode, description);
	}

}
