
package com.solvd.entities;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class AirAnimal extends Animal implements Comparable<AirAnimal> {

	private static final Logger LOG = Logger
			.getLogger(AirAnimal.class.getName());

	public AirAnimal() {
		super();
	}

	public AirAnimal(String name, double weight, TypeAnimal TypeAnimal,
			Movement Movement) {
		super();
		this.name = name;
		this.weigth = weight;
		this.Movement = Movement;
		this.TypeAnimal = TypeAnimal;

	}

	String type;
	int speed;
	int num;

	public String toString() {
		return super.toString();
	}

	public void movement(int speed) {
		LOG.log(Level.INFO,
				" It's " + movement + " with a velocity " + speed + "km/h");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name, type);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirAnimal other = (AirAnimal) obj;
		return Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	public int compareTo(AirAnimal airAnimal) {
		return airAnimal.name.compareTo(this.name);
		// return this.name.compareTo(airAnimal.name);
	}

	public String AirAnimalList() {
		return this.name;
	}

}
