
package com.solvd.exceptions;

public class EmptyVarException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "You have tu put a variable";

	}

}