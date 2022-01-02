
package com.solvd.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class EarthAnimal extends Animal {

	private static final Logger LOG = Logger
			.getLogger(EarthAnimal.class.getName());

	public EarthAnimal() {
		super();
	}

	public EarthAnimal(String name, int weigth, TypeAnimal TypeAnimal,
			Movement Movement) {
		super(name, weigth, TypeAnimal, Movement);

	}

	String gender;
	String food;
	String sound;

	@Override
	public void description(String skin, String gender) {
		LOG.info(" It has " + skin + " and it gender is " + gender);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(gender, name);
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
		EarthAnimal other = (EarthAnimal) obj;
		return Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}

	private Set<EarthAnimal> earth = new HashSet<>();

	public Set<EarthAnimal> getEarth() {
		return earth;
	}

	public void setEarth(Set<EarthAnimal> earth) {
		this.earth = earth;
	}

	public void addAnimal(EarthAnimal a) {
		earth.add(a);
	}

	public void addEarth(EarthAnimal... earthArray) {
		for (EarthAnimal a : earth) {
			earth.add(a);
		}
	}

	public static void printSelectAnimalName(List<EarthAnimal> animal,
			Predicate<EarthAnimal> predicate) {
		for (EarthAnimal a : animal) {
			if (predicate.test(a)) {
				LOG.log(Level.INFO, " " + a);
			}
		}

	}
}
