
package com.solvd.enums;

public enum Movement {

	QUADRUPED("It is quadruped "), BIPED("It is Biped "), FLYING(
			"Flying"), SWIMMING("swimming"), PALMIPED("It is palmiped");

	private String descrip;

	private Movement(String descrip) {
		this.descrip = descrip;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

}
