package com.tcs.exception;

public class UserException extends RuntimeException{
	
	public UserException() {
		super();
	}

	public UserException(String msg) {
		super(msg);
	}
}
