package com.sample2.app.ui.model.response;

public enum ErrorMessages {
	MISSING_REQUIRED_FIELD("Missing required field, please check documentation for required fields."),
	RECORED_ALREADY_EXISTS("Record already exists."),
	INTERNAL_SERVER_ERROR("Internal server error"),
	NORECORD_FOUND("No recored found");
	
	private String errorMessage;
	
	ErrorMessages(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
