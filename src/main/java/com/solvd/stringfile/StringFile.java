package com.solvd.stringfile;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public class StringFile {

	private final static Logger LOG = Logger
			.getLogger(StringFile.class.getName());

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\archivostxt\\coldplay.txt");

		String cont = FileUtils.readFileToString(file, "UTF-8");

		String[] countWords = StringUtils
				.split((RegExUtils
						.removeAll(
								FileUtils
										.readFileToString(file,
												StandardCharsets.UTF_8)
										.toLowerCase(),
								Pattern.compile("[^a-z ]"))));

		Set<String> text = new HashSet<String>();

		text.addAll(List.of(countWords));

		for (String e : text) {
			LOG.info(e);

		}
		LOG.info("The amount of unique words is " + text.size());

		if (file.length() != 0) {
			cont = cont.concat(System.lineSeparator());
		}

		FileUtils.writeStringToFile(file, Integer.toString(text.size()),
				StandardCharsets.UTF_8, true);
	}

}
