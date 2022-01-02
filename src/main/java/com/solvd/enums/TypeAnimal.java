package com.solvd.enums;

public enum TypeAnimal {

	EARTH("earth animal"), AIR("Air Animal"), DOMESTIC("Domestic Animal"), SEA(
			"Sea Animal");

	private String descrip;

	private TypeAnimal(String descrip) {
		this.descrip = descrip;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

}
