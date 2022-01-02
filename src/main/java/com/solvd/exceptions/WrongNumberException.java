
package com.solvd.exceptions;

public class WrongNumberException extends Exception {

	private static final long serialVersionUID = 2L;

	@Override
	public String getMessage() {
		return "Wrong number Exception";
	}

}
