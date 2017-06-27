package com.oreilly.strutsckbk.ch11.sf;

public class AuthenticationException extends SecurityException {
	
	public AuthenticationException() {
		super();
	}
	public AuthenticationException(String msg) {
		super(msg);
	}
	public AuthenticationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
