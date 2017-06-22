package org.opensource.core.exception;

public class CustomExceptionClass extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5378872551804642344L;
	
	String message;

	public CustomExceptionClass(String message) {
		this.message = message;
	}

	public String getLocalizedMessage() {
		return message;
	}
}
