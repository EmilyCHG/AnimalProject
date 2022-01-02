
package com.solvd.entities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class Reflection {

	private static final Logger LOG = Logger
			.getLogger(Reflection.class.getName());

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, ReflectiveOperationException {

		Class<Animal> c = Animal.class;

		System.out.println();
		System.out.println("--------------Fields------------------");
		System.out.println();

		for (Field f : c.getDeclaredFields()) {
			LOG.log(Level.INFO, "" + f.getName());
		}

		System.out.println();
		System.out.println("--------------Constructors------------------");
		System.out.println();

		for (Constructor<?> cons : c.getConstructors()) {
			LOG.log(Level.INFO, "" + cons.getName());
			for (Parameter par : cons.getParameters()) {
				LOG.log(Level.INFO,
						"" + par.getName() + ":" + par.getType().getTypeName());

			}
		}

		System.out.println();
		System.out.println("------------Methods--------------------");
		System.out.println();

		for (Method m : c.getDeclaredMethods()) {
			LOG.log(Level.INFO,
					"" + m.getName() + ":" + m.getReturnType().getTypeName());
			for (Parameter par : m.getParameters()) {
				LOG.log(Level.INFO,
						"" + par.getName() + ":" + par.getType().getTypeName());
			}
		}

		Class.forName("com.project.entities.Animal");
		@SuppressWarnings("deprecation")
		Animal earthAnimal5 = (Animal) c.newInstance();
		earthAnimal5.setName("Cow");
		earthAnimal5.setWeigth(98);
		earthAnimal5.setTypeAnimal(TypeAnimal.EARTH);
		earthAnimal5.setMovement(Movement.QUADRUPED);
		LOG.log(Level.INFO, "" + (earthAnimal5));

	}

}
