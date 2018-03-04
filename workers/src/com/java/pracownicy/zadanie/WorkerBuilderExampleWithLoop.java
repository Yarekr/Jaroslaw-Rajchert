package com.java.pracownicy.zadanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.java.pracownicy.zadanie.builder.Workers;

/**
 * @author jaros
 *
 */
public class WorkerBuilderExampleWithLoop {

	private static final String NAZWA_PLIKU = "pracownicy.txt";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		List<String> lineList = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(NAZWA_PLIKU))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				lineList.add(line);

			}

			Iterator<String> iter = lineList.iterator();
			while (iter.hasNext()) {
				String singleLine = iter.next();

				String[] valueWorker = singleLine.split("\\|");
				
				Workers worker = new Workers.Builder()//
						.imie(valueWorker.length > 0 ? valueWorker[0] : "")//
						.nazwisko(valueWorker.length > 1  ? valueWorker[1] : "")//
						.miasto(valueWorker.length > 2  ? valueWorker[2] : "")//
						.stanowisko(valueWorker.length > 3  ? valueWorker[3] : "")//
						.zarobki(valueWorker.length > 4 ? Integer.valueOf(valueWorker[4]) : 0)//
						.jezyk(valueWorker.length > 5 ? valueWorker[5] : "")//
						.autorskie(valueWorker.length > 6  ? valueWorker[6] : "")
						.benefit(valueWorker.length > 7 ? valueWorker[7] : "" )//
						.build();
				
				System.out.println(worker);
				System.out.println("-------------------------------------------");

			}
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
