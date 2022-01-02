
package com.solvd.file;

import java.io.*;
import java.util.logging.Logger;

public class PrintFile {

	private static final Logger LOG = Logger
			.getLogger(PrintFile.class.getName());

	public static void main(String[] args) throws IOException {

		String line = null;

		try (FileReader fileReader = new FileReader(
				"C:\\Users\\emy06\\OneDrive\\Documentos\\fileout.txt");
				BufferedReader bufferedReader = new BufferedReader(
						fileReader);) {

			while ((line = bufferedReader.readLine()) != null) {
				LOG.info(line);
			}

		} catch (FileNotFoundException e) {
			LOG.info("there is not a file");
		}
	}

	/*
	 * 
	 * PrintFile printFile = new PrintFile (); String firstLine =
	 * printFile.readFirstLineFromFile(
	 * "C:\\Users\\emy06\\OneDrive\\Documentos\\fileout.txt");
	 * LOG.info("firstLine= " + firstLine); }
	 * 
	 * 
	 * public String readFirstLineFromFile(String path) throws IOException {
	 * 
	 * 
	 * BufferedReader br = new BufferedReader (new FileReader(path));
	 * 
	 * try { return br.readLine();
	 * 
	 * } finally {
	 * 
	 * if (br!=null)
	 * 
	 * { br.close(); }
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
}
