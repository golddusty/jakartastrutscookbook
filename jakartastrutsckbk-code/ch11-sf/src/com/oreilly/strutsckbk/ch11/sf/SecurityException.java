package com.oreilly.strutsckbk.ch11.sf;

public class SecurityException extends Exception {
	
	public SecurityException() {
		super();
	}
	public SecurityException(String msg) {
		super(msg);
	}
	public SecurityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
