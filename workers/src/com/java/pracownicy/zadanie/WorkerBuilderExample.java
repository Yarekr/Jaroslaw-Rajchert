package com.java.pracownicy.zadanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.java.pracownicy.zadanie.builder.Workers;

/**
 * @author jaros
 *
 */
public class WorkerBuilderExample {

	private static Workers workers2;
	private static Workers workers3;

	private static final String NAZWA_PLIKU = "pracownicy.txt";
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(NAZWA_PLIKU))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);

			}
			// for(String s:list)
			// System.out.print(list.get(0));
			String worker1 = (list.get(0));
			String[] valuWorker = worker1.split("\\|");

			Workers workers = new Workers.Builder()//
					.imie(valuWorker[0])//
					.nazwisko(valuWorker[1])//
					.miasto(valuWorker[2])//
					.stanowisko(valuWorker[3])//
					.zarobki(Integer.valueOf(valuWorker[4])).jezyk(valuWorker[5])//
					.autorskie(valuWorker[6])//
					.build();

			System.out.println(workers);
			System.out.println("-------------------------------------------");

			// 2 wiersz
			String worker2 = (list.get(1));
			String[] valuWorker2 = worker2.split("\\|");

			workers2 = new Workers.Builder()//
					.imie(valuWorker2[0])//
					.nazwisko(valuWorker2[1])//
					.miasto(valuWorker2[2])//
					.stanowisko(valuWorker2[3])//
					.zarobki(Integer.valueOf(valuWorker2[4])) //
					.jezyk(valuWorker2[5]).autorskie(valuWorker2[6])//
					.build();

			System.out.println(workers2);
			System.out.println("-------------------------------------------");

			// 3 wiersz

			String worker3 = (list.get(2));
			String[] valuWorker3 = worker3.split("\\|");

			workers3 = new Workers.Builder()//
					.imie(valuWorker3[0])//
					.nazwisko(valuWorker3[1])//
					.miasto(valuWorker3[2])//
					.stanowisko(valuWorker3[3])//
					.zarobki(Integer.valueOf(valuWorker3[4])) //
					.jezyk(valuWorker3[5])//
					.build();
			// .autorskie(valuWorker3[6])

			System.out.println(workers3);

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// }
		// catch (IOException e) {
		// System.out.println(e.getMessage());

	}

}
