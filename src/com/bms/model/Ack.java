package com.bms.model;

import java.io.Serializable;

public class Ack implements Serializable {

	private static final long serialVersionUID = 5359752567487663424L;

	private String status;

	private String message;

	public Ack() {

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Ack [status=%s, message=%s]", status, message);
	}

}
