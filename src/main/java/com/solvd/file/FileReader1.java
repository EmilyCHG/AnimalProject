
package com.solvd.file;

import java.io.*;
import java.util.logging.Logger;

public class FileReader1 {

	private static final Logger LOG = Logger
			.getLogger(FileReader1.class.getName());

	public static void main(String[] args) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\emy06\\OneDrive\\Documentos\\fileout.txt"));

			bw.write("Emily\n");
			bw.write("Ariana\n");
			bw.write("Gaby\n");
			bw.write("Neira\n");
			bw.close();

		} catch (IOException e) {
			LOG.info("There is not a file" + e.getMessage());

		}

	}

}
