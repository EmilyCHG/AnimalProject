
package com.solvd.entities;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class FunctionalInterfacesExample {

	private static final Logger LOG = Logger
			.getLogger(FunctionalInterfacesExample.class.getName());

	public static void main(String[] args) {

		System.out.println("-------------Fuctional Functions------------");

		EarthAnimal earthAnimal1 = new EarthAnimal("Lyon", 150,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		EarthAnimal earthAnimal2 = new EarthAnimal("Monkey", 50,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		EarthAnimal earthAnimal3 = new EarthAnimal("bear", 300,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		EarthAnimal earthAnimal4 = new EarthAnimal("elephant", 580,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		EarthAnimal earthAnimal5 = new EarthAnimal("giraffe", 300,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		AirAnimal airAnimal3 = new AirAnimal("parrow ", 1, TypeAnimal.AIR,
				Movement.FLYING);
		AirAnimal airAnimal4 = new AirAnimal("butterfly ", 0.1, TypeAnimal.AIR,
				Movement.FLYING);
		AirAnimal airAnimal5 = new AirAnimal("chicken ", 3, TypeAnimal.AIR,
				Movement.BIPED);
		AirAnimal airAnimal6 = new AirAnimal("dove ", 1, TypeAnimal.AIR,
				Movement.FLYING);
		AirAnimal airAnimal2 = new AirAnimal("Duck", 3, TypeAnimal.AIR,
				Movement.PALMIPED);

		Consumer<EarthAnimal> consumer = (t) -> LOG.log(Level.INFO, "" + t);
		consumer.accept(earthAnimal1);

		System.out.println("---------------Own Fuction-----------------------");

		Animal animal = new Animal();
		animal.addAnimals(earthAnimal1, airAnimal5, airAnimal2, earthAnimal2,
				earthAnimal3, earthAnimal4, airAnimal3, airAnimal4, airAnimal6,
				earthAnimal5);
		LOG.log(Level.INFO, Arrays.toString(animal.getAnimals().toArray()));

		for (Animal a : animal.getAnimals()) {
			LOG.log(Level.INFO, a.getTypeAnimal().toString());
		}

		for (Animal a : animal.getAnimals()) {
			LOG.log(Level.INFO, a.getName());
		}

		for (Animal a : animal.getAnimals()) {
			Animal.returnType(a, animal1 -> animal1.getTypeAnimal()
					.equals(TypeAnimal.EARTH));
		}

		System.out.println("-------------------------------------------------");

		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		LOG.log(Level.INFO, "" + supplier.get());

		System.out.println("-------------------------------------------------");

		List<EarthAnimal> listEarth = Arrays.asList(
				new EarthAnimal("Elephant", 185, TypeAnimal.EARTH,
						Movement.QUADRUPED),
				new EarthAnimal("Tiger", 86, TypeAnimal.EARTH,
						Movement.QUADRUPED),
				new EarthAnimal("Bear", 220, TypeAnimal.EARTH,
						Movement.QUADRUPED));

		EarthAnimal.printSelectAnimalName(listEarth,
				a -> a.getName().startsWith("E"));

		System.out.println("-------------------------------------------------");

		List<DomesticAnimal> listDomestic = Arrays.asList(
				new DomesticAnimal("rabbit", 8, TypeAnimal.DOMESTIC,
						Movement.BIPED),
				new DomesticAnimal("Parrow", 2, TypeAnimal.DOMESTIC,
						Movement.FLYING),
				new DomesticAnimal("duck", 4, TypeAnimal.DOMESTIC,
						Movement.PALMIPED),
				new DomesticAnimal("horse", 200, TypeAnimal.DOMESTIC,
						Movement.QUADRUPED));

		DomesticAnimal.returnTypes(listDomestic, a -> true,
				a -> LOG.log(Level.INFO, " " + a.getTypeAnimal()));

		listDomestic.forEach(a -> LOG.log(Level.INFO, " " + a.getMovement()));
	}

}
