
package com.solvd.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.solvd.generic.GenericClass;
import com.solvd.generic.StaticPetshop;
import com.solvd.exceptions.EmptyVarException;
import com.solvd.exceptions.EqualsException;
import com.solvd.exceptions.WrongLengthException;
import com.solvd.exceptions.WrongNumberException;
import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;
import com.solvd.entities.*;

public class AnimalsRunner {

	private static final Logger LOG = Logger
			.getLogger(AnimalsRunner.class.getName());

	public static void main(String[] args) {

		System.out.println("------------Earth Animal 1----------------");
		System.out.println();

		EarthAnimal earthAnimal1 = new EarthAnimal("Lyon", 150,
				TypeAnimal.EARTH, Movement.QUADRUPED);

		try {
			earthAnimal1.identification("lyon", TypeAnimal.EARTH);
		} catch (EqualsException e) {
			LOG.throwing("earthAninmal1", "identification", e);
		}
		System.out.println();

		try {
			earthAnimal1.typeOfAnimal(-190, Movement.QUADRUPED);
		} catch (WrongNumberException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}
		System.out.println();

		try {
			earthAnimal1.home("ly", "lakes");
		} catch (WrongLengthException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}

		System.out.println();

		earthAnimal1.description("short coat", "felidae");

		System.out.println();
		System.out.println("---------Earth Animal 2-----------------------");
		System.out.println();

		EarthAnimal earthAnimal2 = new EarthAnimal("Monkey", 50,
				TypeAnimal.EARTH, Movement.QUADRUPED);

		System.out.println(earthAnimal2);

		try {
			earthAnimal2.typeOfAnimal(50, Movement.QUADRUPED);
		} catch (WrongNumberException e) {
			System.out.println(e);
			LOG.log(Level.WARNING, e.getMessage());
		}
		System.out.println();

		try {
			earthAnimal2.animalSound("monkey", "juju");
		} catch (EqualsException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}
		System.out.println();

		try {
			earthAnimal2.eat("Monkey", "");
		} catch (EmptyVarException e) {
			LOG.log(Level.WARNING, e.getMessage());
		}

		EarthAnimal earthAnimal3 = new EarthAnimal("bear", 300,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		EarthAnimal earthAnimal4 = new EarthAnimal("elephant", 580,
				TypeAnimal.EARTH, Movement.QUADRUPED);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		if (earthAnimal1.equals(earthAnimal2)) {
			LOG.info("they are the same type of animals");

		} else {
			LOG.info("they are not the same type of animals");

		}

		System.out.println();
		System.out.println("---------------Air Animal1-----------------");
		System.out.println();

		AirAnimal airAnimal1 = new AirAnimal("Eagle", 6, TypeAnimal.AIR,
				Movement.FLYING);

		LOG.log(Level.INFO, " Air Animal", airAnimal1);

		try {
			airAnimal1.identification("Eagle ", TypeAnimal.AIR);
		} catch (EqualsException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}

		System.out.println();
		try {
			airAnimal1.typeOfAnimal(8, Movement.FLYING);
		} catch (WrongNumberException e) {
			LOG.log(Level.WARNING, e.getMessage());
		}

		System.out.println();

		airAnimal1.movement(50);
		airAnimal1.description("pens", "Accitripidae");
		airAnimal1.animalSleep("eagle");

		try {
			airAnimal1.identification("eagle", TypeAnimal.AIR);
		} catch (EqualsException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}

		System.out.println();
		try {
			airAnimal1.time("animals", -5);
		} catch (WrongNumberException e) {
			LOG.log(Level.INFO, e.getMessage());
		}

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

		try {
			airAnimal2.identification("duck", TypeAnimal.AIR);
		} catch (EqualsException e) {
			LOG.log(Level.SEVERE, e.getMessage());
		}

		System.out.println();
		try {
			airAnimal2.typeOfAnimal(568525, Movement.PALMIPED);
		} catch (WrongNumberException e) {
			LOG.log(Level.WARNING, e.getMessage());
		}

		System.out.println();
		airAnimal2.description("pens", "Anatidae");
		System.out.println();

		try {
			airAnimal2.home("duck", "la");
		} catch (WrongLengthException e) {
			LOG.log(Level.FINE, e.getMessage());
		}

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		if (airAnimal1.equals(airAnimal2)) {
			System.out.println("they are the same type of animals");

		} else {
			System.out.println("they are not the same type of animals");
		}

		System.out.println();
		System.out.println("--------------Domestic Animals------------------");
		System.out.println();

		DomesticAnimal domestic1 = new DomesticAnimal("dog", 4,
				TypeAnimal.DOMESTIC, Movement.QUADRUPED);
		DomesticAnimal domestic2 = new DomesticAnimal("cat", 2,
				TypeAnimal.DOMESTIC, Movement.QUADRUPED);
		DomesticAnimal domestic3 = new DomesticAnimal("rabbit", 3,
				TypeAnimal.DOMESTIC, Movement.BIPED);
		DomesticAnimal domestic4 = new DomesticAnimal("horse", 200,
				TypeAnimal.DOMESTIC, Movement.QUADRUPED);

		System.out.println();
		System.out.println("---------------Final Methods-----------------");
		System.out.println();

		final DomesticAnimal domAni = new DomesticAnimal();
		domAni.play();
		domAni.live();

		System.out.println();
		System.out.println("--------------Sea Animals------------------");
		System.out.println();

		SeaAnimal seaAnimal1 = new SeaAnimal("squid", 5, TypeAnimal.SEA,
				Movement.SWIMMING);
		SeaAnimal seaAnimal2 = new SeaAnimal("shark", 340, TypeAnimal.SEA,
				Movement.SWIMMING);
		SeaAnimal seaAnimal3 = new SeaAnimal("seal", 10, TypeAnimal.SEA,
				Movement.SWIMMING);
		SeaAnimal SeaAnimal4 = new SeaAnimal("dolphin", 170, TypeAnimal.SEA,
				Movement.SWIMMING);

		System.out.println();
		System.out.println("----------Static Block----------------------");
		System.out.println();

		StaticPetshop.open();
		StaticPetshop.close();

		System.out.println();
		System.out.println(
				"------------Implementation Lists--------------------");
		System.out.println();

		/*
		 * Set<EarthAnimal> earth = new HashSet<EarthAnimal>();
		 * 
		 * earth.add(earthAnimal1); earth.add(earthAnimal2);
		 * earth.add(earthAnimal3); earth.add(earthAnimal4);
		 * earth.add(earthAnimal5); earth.add(earthAnimal2);
		 */

		EarthAnimal earth = new EarthAnimal();
		earth.addAnimal(earthAnimal1);
		earth.addAnimal(earthAnimal2);
		earth.addAnimal(earthAnimal3);
		earth.addAnimal(earthAnimal4);

		LOG.log(Level.INFO, Arrays.toString(earth.getEarth().toArray()));

		// LOG.log(Level.INFO, "Size: " + earth.size());
		// LOG.log(Level.INFO, "Is Empty: " + earth.isEmpty());
		// LOG.log(Level.INFO, "Contains; " + earth.contains(earthAnimal1));

		/*
		 * for (EarthAnimal e : earth) { System.out.println(e); }
		 */

		/*
		 * List <Set <EarthAnimal>> earthAnimal = new ArrayList <Set
		 * <EarthAnimal>>();
		 * 
		 * Set <EarthAnimal> mov1 = new HashSet<EarthAnimal>(); Set
		 * <EarthAnimal> mov2 = new HashSet<EarthAnimal>();
		 * 
		 * 
		 * mov1.add(earthAnimal1); mov2.add(earthAnimal2);
		 * 
		 * earthAnimal.add(0,mov1); earthAnimal.add(1,mov2);
		 * earthAnimal.add(2,mov1);
		 * 
		 * System.out.println(earthAnimal);
		 * 
		 */

		System.out.println();
		System.out.println(
				"------------Implementation TreeSet List--------------------");
		System.out.println();

		Set<AirAnimal> airAnimal = new TreeSet<AirAnimal>();

		airAnimal.add(airAnimal2);
		airAnimal.add(airAnimal1);
		airAnimal.add(airAnimal4);
		airAnimal.add(airAnimal3);
		airAnimal.add(airAnimal5);
		airAnimal.add(airAnimal6);

		List<AirAnimal> list = new ArrayList<AirAnimal>();
		list.addAll(airAnimal);
		// Collections.reverse(list);
		list.forEach(System.out::println);

		System.out.println();
		System.out.println(
				"------------Implementation LinkedList List--------------------");
		System.out.println();

		LinkedList<DomesticAnimal> domesticAnimal = new LinkedList<DomesticAnimal>();

		domesticAnimal.add(domestic1);
		domesticAnimal.add(domestic3);
		domesticAnimal.add(domestic4);
		domesticAnimal.add(domestic2);

		for (DomesticAnimal element : domesticAnimal) {
			LOG.log(Level.INFO, " Collection of Domestic Animals" + element);
		}

		System.out.println();
		System.out.println(
				"------------Implemention  Queue List--------------------");
		System.out.println();

		Queue<SeaAnimal> seaAnimal = new LinkedList<SeaAnimal>();

		seaAnimal.add(seaAnimal1);
		seaAnimal.add(seaAnimal2);
		seaAnimal.add(SeaAnimal4);
		seaAnimal.add(seaAnimal3);

		for (SeaAnimal element : seaAnimal) {
			LOG.log(Level.INFO, " Collection of SeaAnimal" + element);
		}

		System.out.println();
		// nameAnimal2.poll();
		System.out.println();
		System.out.println();
		// System.out.println(seaAnimal.toArray()[5]);

		System.out.println(seaAnimal.poll()); // Subtract

		// nameAnimal2.poll();

		LOG.log(Level.INFO, " ", seaAnimal.peek()); // add
		LOG.log(Level.INFO, " ", seaAnimal);

		System.out.println();
		System.out.println(
				"------------Implementation Maps and HashMap List--------------------");
		System.out.println();

		Map<String, EarthAnimal> list1 = new HashMap<String, EarthAnimal>();

		list1.put("First Animal ", earthAnimal2);
		list1.put("Second Animal ", earthAnimal1);
		list1.put("third Animal ", earthAnimal3);
		list1.put("Fourth Animal ", earthAnimal4);

		// list.replace("First Animal ", earthAnimal2);
		// list.get("First Animal");
		// list.remove("Second Animal");

		for (Entry<String, EarthAnimal> e : list1.entrySet()) {
			LOG.log(Level.INFO, e.getKey() + " - " + e.getValue());

		}

		System.out.println();
		System.out.println(
				"------------Implementation Generics --------------------");
		System.out.println();

		GenericClass<String> listGe = new GenericClass<String>();

		listGe.push("Lyon");
		listGe.push("Monkey");
		listGe.push("Rabbit");
		listGe.push("Cow");
		listGe.push("Fish");

		LOG.log(Level.INFO, listGe.pop());
		LOG.log(Level.INFO, listGe.pop());
		LOG.log(Level.INFO, listGe.pop());
		LOG.log(Level.INFO, listGe.peek());

		System.out.println(
				"-----------------------------------------------------");

	}

}
