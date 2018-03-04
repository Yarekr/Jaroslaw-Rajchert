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
public class OdczytZapis {

	private static BufferedReader odczyt;

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		String wiersz;
		FileInputStream fin = null;

		// jezeli juz tak to w klasie powinien byc jeden blok try/catch, nie jeden po
		// drugim
		try {
			fin = new FileInputStream("Pracownicy.txt");

			odczyt = new BufferedReader(new InputStreamReader(fin));

			while ((wiersz = odczyt.readLine()) != null) {
				// tutaj mozesz parsowac

				System.out.println();
				System.out.println(wiersz);

			}
		} catch (FileNotFoundException e) {
			System.out.println("dupa!! nie ma pliku! " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
