
package com.solvd.entities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.solvd.enums.Movement;
import com.solvd.enums.TypeAnimal;

public class StreamCollections {

	private static final Logger LOG = Logger
			.getLogger(StreamCollections.class.getName());

	public static void main(String[] args) throws IOException {

		List<SeaAnimal> ani1 = Arrays.asList(
				new SeaAnimal("seahorse", 1, TypeAnimal.SEA, Movement.SWIMMING),
				new SeaAnimal("karb", 1, TypeAnimal.EARTH, Movement.SWIMMING),
				new SeaAnimal("squid", 3, TypeAnimal.SEA, Movement.SWIMMING),
				new SeaAnimal("dolphin", 170, TypeAnimal.SEA,
						Movement.SWIMMING),
				new SeaAnimal("jellyfish", 15, TypeAnimal.SEA,
						Movement.SWIMMING));

		ani1.stream().forEach(a -> LOG.log(Level.INFO, a.getName()));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		ani1.stream().filter(a -> a.getName().startsWith("s"))
				.forEach(a -> LOG.log(Level.INFO, a.getName()));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		List<SeaAnimal> types = ani1.stream()
				.filter(a -> a.getTypeAnimal().equals(TypeAnimal.SEA))
				.collect(Collectors.toList());

		types.forEach(a -> LOG.log(Level.INFO, "" + a));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		List<SeaAnimal> anotherList = ani1.stream()
				.filter(a -> a.getWeigth() >= 50).collect(Collectors.toList());

		anotherList.forEach(a -> LOG.log(Level.INFO, a.getName()));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		List<SeaAnimal> sortedList = ani1.stream()
				.sorted(Comparator.comparing(a -> a.name))
				.collect(Collectors.toList());

		sortedList.forEach(a -> LOG.log(Level.INFO, a.name));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		Stream<String> coldplay = Files
				.lines(Paths.get("C:\\archivostxt\\coldplay.txt"));

		coldplay.sorted().filter(x -> x.length() > 4)
				.forEach(x -> LOG.log(Level.INFO, x));
		coldplay.close();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		List<String> coldplay2 = Files
				.lines(Paths.get("C:\\archivostxt\\coldplay.txt"))
				.filter(x -> x.contains("Coldplay"))
				.collect(Collectors.toList());
		coldplay2.forEach(x -> LOG.log(Level.INFO, x));

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();

		boolean allMatch = ani1.stream().allMatch(x -> x.getWeigth() > 2);

		LOG.log(Level.INFO, "" + allMatch);

	}

}
