package com.solvd.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;
import com.solvd.exceptions.EmptyVarException;
import com.solvd.exceptions.EqualsException;
import com.solvd.exceptions.WrongLengthException;
import com.solvd.exceptions.WrongNumberException;
import com.solvd.interfaces.IAnimalEat;
import com.solvd.interfaces.IAnimalSleep;
import com.solvd.interfaces.IAnimalSound;
import com.solvd.interfaces.IAnimalTime;
import com.solvd.interfaces.IHome;
import com.solvd.interfaces.ISeeTypeAnimal;

public class Animal
		implements
			Comparable<AirAnimal>,
			IAnimalSound,
			IAnimalSleep,
			IAnimalTime,
			IHome,
			IAnimalEat {

	private static final Logger LOG = Logger.getLogger(Animal.class.getName());

	protected String name;
	protected double weigth;
	protected String movement;
	protected String type;
	int num;
	String home;
	TypeAnimal TypeAnimal;
	Movement Movement;

	public Animal() {
		super();
	}

	public Animal(String name, double weight, TypeAnimal TypeAnimal,
			Movement Movement) {
		super();
		this.name = name;
		this.weigth = weight;
		this.Movement = Movement;
		this.TypeAnimal = TypeAnimal;
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public TypeAnimal getTypeAnimal() {
		return TypeAnimal;
	}

	public void setTypeAnimal(TypeAnimal typeAnimal) {
		TypeAnimal = typeAnimal;
	}

	public Movement getMovement() {
		return Movement;
	}

	public void setMovement(Movement movement) {
		Movement = movement;
	}

	public static Logger getLog() {
		return LOG;
	}

	public String getName() {
		return name;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public int compareTo(Animal Animal) {
		return Animal.name.compareTo(this.name);
		// return this.name.compareTo(airAnimal.name);
	}

	public String AirAnimalList() {
		return this.name;
	}

	@Override
	public int compareTo(AirAnimal AirAnimal) {
		// TODO Auto-generated method stub
		return AirAnimal.name.compareTo(this.name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void home() {
		// TODO Auto-generated method stub

	}

	@Override
	public void time() {
		// TODO Auto-generated method stub

	}

	@Override
	public void animalSleep() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unlikely-arg-type")
	public void identification(String name, TypeAnimal TypeAnimal)
			throws EqualsException {

		if (name.equals(TypeAnimal)) {
			throw new EqualsException();
		}
		LOG.info(name + " is an animal of " + TypeAnimal);
	}

	public void typeOfAnimal(int weight, Movement Movement)
			throws WrongNumberException {

		if (weight < 0 || weight > 10000) {
			throw new WrongNumberException();
		}
		LOG.info(" Weight " + weight + " kg," + " Movement: " + Movement);
	}

	public void movement(Movement Movement) {
		LOG.info(" It's " + Movement);
	}

	public void description(String skin, String gender) {
		LOG.info(" It has " + skin + " and it gender is " + gender);
	}

	public String toString() {
		return name + ", weigth: " + weigth + ", type: " + TypeAnimal
				+ ", movement: " + Movement;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Movement, name, TypeAnimal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(Movement, other.Movement)
				&& Objects.equals(name, other.name)
				&& Objects.equals(TypeAnimal, other.TypeAnimal);
	}

	public void eat(String name, String food) throws EmptyVarException {

		if (name.isEmpty() || food.isEmpty()) {
			throw new EmptyVarException();
		}
		LOG.info(name + " feeds on: " + food);
	}

	public void home(String name, String home) throws WrongLengthException {
		if (name.length() <= 2 || (home.length() <= 2)) {
			throw new WrongLengthException();
		}
		LOG.info(name + " Lives in: " + home);
	}

	public void time(String name, int num) throws WrongNumberException {
		if (num >= 100 || num <= 0) {
			throw new WrongNumberException();
		}

		LOG.info("the " + name + " has a time of life of " + num + " years");

	}

	public void animalSleep(String name) {
		LOG.info(name + " is zzz... ");

	}

	public void animalSound(String name, String sound) throws EqualsException {
		if (name.equals(sound)) {
			throw new EqualsException();
		}
		LOG.info(name + " do a sound like a  " + sound);
	}

	private List<Animal> animals = new ArrayList<>();

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal a) {
		animals.add(a);
	}

	public void addAnimals(Animal... animalArray) {
		for (Animal a : animalArray) {
			animals.add(a);
		}
	}

	public List<Animal> getTypeAnimal(TypeAnimal typeAnimal) {

		List<Animal> subList = new ArrayList<Animal>();
		for (Animal a : animals) {
			if (typeAnimal.equals(a.getTypeAnimal())) {
				subList.add(a);
			}
		}
		return subList;
	}

	public static void returnType(Animal animal,
			ISeeTypeAnimal iSeeTypeAnimal) {
		boolean isType = iSeeTypeAnimal.see(animal);
		LOG.info(" Animal " + animal.getTypeAnimal() + "  " + isType);

	}

}
