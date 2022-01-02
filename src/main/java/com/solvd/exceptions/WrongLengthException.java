
package com.solvd.exceptions;

public class WrongLengthException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Wrong Length Exception";

	}

}