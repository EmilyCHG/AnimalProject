
package com.solvd.generic;

import java.util.logging.Logger;

import com.solvd.entities.DomesticAnimal;

public class StaticPetshop extends DomesticAnimal {

	private static final Logger LOG = Logger
			.getLogger(StaticPetshop.class.getName());

	public final static String NAME_SHOP = "little PET";
	public final static int HOUR = 8;
	public final static int HOUR2 = 18;

	public static void open() {

		LOG.info("the " + NAME_SHOP + " opens at " + HOUR + " am");
	}

	public static void close() {
		LOG.info("the " + NAME_SHOP + " closes at " + HOUR2 + " pm");
	}

}