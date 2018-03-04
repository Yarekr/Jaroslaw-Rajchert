package zadnie1;

import java.util.Random;

public class Tablice {

	public static void main(String[] args) {

		Tablice zadanie = new Tablice();
		int[][] tablica = zadanie.initializeTable(3, 3);
		zadanie.initializeTable(tablica, 7);
		zadanie.jakDzialaIf();
		zadanie.jakDzialaFor(5);
		zadanie.jakDzialaForCoX(10, 3);
		zadanie.zrobTabliceJednowymiarowa(10);
	}

	/**
	 * Stworz tablcice
	 * 
	 * @param x
	 *            rozmiar w poziomie
	 * @param y
	 *            rozmiar w pionie
	 * @return pusta tablica o rozmiarze x na y
	 */
	private int[][] initializeTable(int x, int y) {

		int[][] tablica = null; // w tym miejscu masz zdefiniowany typ zmiennej, nie wartosci ani obszar w
								// pamieci

		tablica = new int[x][y]; // definiujemy obszar w pamieci, ale bez wartosci

		wyswietlTablice(tablica);
		return tablica;
	}

	/**
	 * Stworz tablcice
	 * 
	 * @param x
	 *            rozmiar w poziomie
	 * @return pusta tablica o rozmiarze x na y
	 */
	private int[] zrobTabliceJednowymiarowa(int x) {

		int[] tablica = null; // w tym miejscu masz zdefiniowany typ zmiennej, nie wartosci ani obszar w
								// pamieci

		tablica = new int[x]; // definiujemy obszar w pamieci, ale bez wartosci
		Random random = new Random();
		for (int i = 0; i < x; i++) {
			tablica[i] = random.nextInt(100);
			System.out.print(tablica[i]+ ", ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
//		TODO policz sume / srednia itd
		return tablica;
	}

	/**
	 * Metoda ustawia wartosc na kazdej pozycji w tablicy
	 * 
	 * @param tablicaDoWypelnienia
	 *            tablica
	 * @param wartosc
	 *            wartosc
	 * @return wypelniona tablica
	 */
	private int[][] initializeTable(int[][] tablicaDoWypelnienia, int wartosc) {

		// Petla: powtarzaj tak dlugo az indeks kolumny bedzie mniejszy niz rozmiar
		// tablicy w poziomie:
		for (int i = 0; i < tablicaDoWypelnienia.length; i++) {

			// Petla: powtarzaj tak dlugo az indeks pierwszego wiersza bedzie mniejszy niz
			// maksymalny rozmiar wiersza
			for (int j = 0; j < tablicaDoWypelnienia[0].length; j++) {

				// jak dostac sie do elementu tablicy?
				int element = tablicaDoWypelnienia[i][j]; // wez element z i-tej kolumny i j-tego wiersza

				// jak ustawic wartosc?
				tablicaDoWypelnienia[i][j] = wartosc;
			} // koniec iteracji po wierszu
		} // koniec iteracji po kolumnie

		wyswietlTablice(tablicaDoWypelnienia);
		return tablicaDoWypelnienia; // zwroc wypelniona tablice
	}

	/**
	 * Metoda wyswietlajaca dowolna tablice w formacie i , j wartosc
	 * 
	 * @param tablica
	 *            tablica do wyswietlenia
	 */
	private void wyswietlTablice(int[][] tablica) {
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + tablica[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
	}

	private void jakDzialaIf() {
		Random random = new Random();
		boolean losowaWartoscTrueFalse = random.nextBoolean();
		System.out.println("Wylosowalem: " + losowaWartoscTrueFalse);
		// instrukcja warunkowa if:
		if (losowaWartoscTrueFalse == true) { // wewnatrz: warunek do przetestowania -> czy losowa wartosc == true
			System.out.println("losowa wartosc  == true");
		} else { // test warunku wypadl negatywnie
			System.out.println("losowa wartosc  == false");
		}
		System.out.println("---------------------------------------------------------");
	}

	private void jakDzialaFor(int jakDlugo) {

		for (int i = 0; i < jakDlugo; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
	}

	/**
	 * @param jakDlugo
	 *            Ilosc iteracji
	 * @param coIle
	 *            co ile inkrementowac
	 */
	private void jakDzialaForCoX(int jakDlugo, int coIle) {

		for (int i = 0; i < jakDlugo; i = i + coIle) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
	}
}
