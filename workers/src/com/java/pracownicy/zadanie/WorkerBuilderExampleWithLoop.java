package com.java.pracownicy.zadanie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
	
	 ;
	
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
						.name(valueWorker.length > 0 ? valueWorker[0] : "")//
						.lastName(valueWorker.length > 1  ? valueWorker[1] : "")//
						.city(valueWorker.length > 2  ? valueWorker[2] : "")//
						.position(valueWorker.length > 3  ? valueWorker[3] : "")//
						.salary(valueWorker.length > 4 ? Integer.valueOf(valueWorker[4]) : 0)//
						.language(valueWorker.length > 5 ? valueWorker[5] : "")//
						.tax(valueWorker.length > 6  ? valueWorker[6] : "")
						.benefit(valueWorker.length > 7 ? valueWorker[7] : "" )//
						.build();
				
		
				System.out.println(worker);
				System.out.println("-------------------------------------------");

				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter("WORKERS_SAVE.txt", true))){
					bw.write(worker.toString());
					}
				
				
			}
		
		
		
		
		
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
		
	}
	
		
	
}
