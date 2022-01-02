
package com.solvd.entities;

import com.solvd.enums.TypeAnimal;
import com.solvd.enums.Movement;

public class SeaAnimal extends Animal {

	public SeaAnimal() {
		super();
	}

	public SeaAnimal(String name, int weigth, TypeAnimal TypeAnimal,
			Movement Movement) {
		super(name, weigth, TypeAnimal, Movement);
	}

	public String toString() {
		return super.toString();
	}

}
