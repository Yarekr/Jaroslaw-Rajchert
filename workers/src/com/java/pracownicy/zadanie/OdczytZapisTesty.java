package com.java.pracownicy.zadanie;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jaros
 *
 */
public class OdczytZapisTesty {

	private static BufferedReader odczyt;

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		String wiersz;
		FileInputStream fin = null;

		
		try {
			fin = new FileInputStream("Pracownicy.txt");

			odczyt = new BufferedReader(new InputStreamReader(fin));

			while ((wiersz = odczyt.readLine()) != null) {
				
				System.out.println();
				System.out.println(wiersz);

			}
		} catch (FileNotFoundException e) {
			System.out.println("no file there! " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
