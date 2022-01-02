package com.solvd.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class DomesticAnimal extends Animal {

	private static final Logger LOG = Logger
			.getLogger(DomesticAnimal.class.getName());

	public DomesticAnimal() {
		super();
	}

	public DomesticAnimal(String name, int weigth, TypeAnimal TypeAnimal,
			Movement Movement) {
		super(name, weigth, TypeAnimal, Movement);

	}

	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}

	public final void play() {

		LOG.info(name + " plays with the ball");

	}

	public final void live() {
		LOG.info("lives with his owner in " + home);

	}

	private List<DomesticAnimal> domestic = new ArrayList<>();

	public List<DomesticAnimal> getDomestic() {
		return domestic;
	}

	public void setDomestic(List<DomesticAnimal> domestic) {
		this.domestic = domestic;
	}

	public void addDomestic(DomesticAnimal d) {
		domestic.add(d);
	}

	public void addDomestic(DomesticAnimal... domesticArray) {
		for (DomesticAnimal d : domesticArray) {
			domestic.add(d);
		}
	}

	public List<DomesticAnimal> getDomesticMovement(Movement movement) {

		List<DomesticAnimal> subList = new ArrayList<DomesticAnimal>();
		for (DomesticAnimal d : domestic) {
			if (movement.equals(d.getMovement())) {
				subList.add(d);
			}
		}
		return subList;
	}

	public static void returnTypes(List<DomesticAnimal> animal,
			Predicate<DomesticAnimal> predicate,
			Consumer<DomesticAnimal> consumer) {
		for (DomesticAnimal a : animal) {
			if (predicate.test(a)) {
				consumer.accept(a);
			}
		}

	}

}
