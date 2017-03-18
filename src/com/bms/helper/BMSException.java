package com.bms.helper;

import com.bms.helper.Constants.ErrorCode;

public final class BMSException extends RuntimeException {

	private static final long serialVersionUID = -3656873180745941327L;

	private String errorCode;

	private String errorMessage;

	public BMSException() {

	}

	public BMSException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public BMSException(String errorCode, String errorMessage, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public BMSException(ErrorCode errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode.get();
		this.errorMessage = errorMessage;
	}
	
	public BMSException(ErrorCode errorCode, String errorMessage, Throwable cause) {
		super(cause);
		this.errorCode = errorCode.get();
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return String.format("BMSException [errorCode=%s, errorMessage=%s]",
				errorCode, errorMessage);
	}

}
