package com.sample2.app.exceptions;

public class UserServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 1677359309659582451L;
	
	public UserServiceException(String message)
	{
		super(message);
	}
}
