package com.oreilly.strutsckbk.ch11.ams;

public class UnknownUserException extends SecurityException {
	
	public UnknownUserException() {
		super();
	}
	public UnknownUserException(String msg) {
		super(msg);
	}
	public UnknownUserException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
