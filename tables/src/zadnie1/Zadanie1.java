package zadnie1;

import java.util.Random;

/* Napisa� program, kt�ry tworzy dwuwymiarow� tablic� liczb ca�kowitych o losowej wielko�ci (wylosowanej z
* zakresu [10, 20]), gdzie liczba wierszy jest taka sama, jak liczba kolumn.
* Nast�pnie tablica zostaje uzupe�niona liczbami losowymi z zakresu [-100, 100], z wyj�tkiem element�w
* znajduj�cych si� na przek�tnej tablicy, kt�re w (losowo) ok. 50% przypadk�w otrzymuj� warto�� 1, a w
* pozosta�ych 50% przypadk�w warto�� -1.
* W wyniku dzia�ania programu nale�y wy�wietli� na ekran:
* � dwie najwi�ksze liczby zapisane w tabeli,
* � stosunek sumy liczb le��cych w kom�rkach tablicy o parzystych indeksach wierszy i sumy liczb le��cych w kom�rkach tablicy o nieparzystych
* indeksach kolumn,
* � liczb� kom�rek, kt�rych warto�� jest mniejsza od iloczynu indeksu wiesza i kolumny tej kom�rki.
* Uwaga,
* nie nale�y u�ywa� (importowa�) �adnych dodatkowych bibliotek, poza klas� niezb�dn� do obs�ugi losowania liczb
 * 
 * 
 */
public class Zadanie1 {
	int[][] tablica = null;
	int x = generateNumber(10, 20);
	int y = x;

	/**
	 * Method initializes tables with radnom numbers
	 * 
	 * @return table
	 */
	private int[][] initializeTable() {

		tablica = new int[x][y];

		for (int i = 0; i < x; i++) { // iterate row
			for (int j = 0; j < y; j++) { // iterate column
				if (i != j) {
					tablica[i][j] = generateNumber(-100, 100);
				} else {
					// przekatna:
					tablica[i][j] = generujPrzekatna();
				}
				int element = tablica[i][j];
				System.out.print("[" + i + "][" + j + "] = " + element + ", ");
			}
			System.out.println();

		}
		return tablica;
	}

	/**
	 * Method generates diagonal values = 1 or -1
	 * 
	 * @return 1 or -1
	 */
	private int generujPrzekatna() {
		Random generator = new Random();
		boolean trueFalse = generator.nextBoolean();
		if (trueFalse == true) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * Method generates random number
	 * 
	 * @param from
	 *            min value
	 * @param to
	 *            max value
	 * @return value
	 */
	private int generateNumber(int from, int to) {
		Random generator = new Random();
		int result = generator.nextInt(to - from) + from;
		return result;
	}

	/**
	 * Method calculates 2 maximum values
	 * 
	 * @return values
	 */
	private int[] getMax() {
		int wynik[] = { -101, -101 };
		int indeksy[] = new int[2];

		// biggest element / najwiekszy element:
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int element = tablica[i][j];
				if (element > wynik[0]) {
					wynik[0] = element;
					indeksy[0] = i;
					indeksy[1] = j;
				}
			}
		}

		System.out.println("Najwiekszy element na pozycji " + indeksy[0] + "," + indeksy[1]);

		// 2nd biggest element/ drugi najwiekszy element:
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int element = tablica[i][j];
				if (element > wynik[1]) {
					if (element == wynik[0] && i == indeksy[0] && j == indeksy[1]) {

					} else {
						wynik[1] = element;
					}
				}
			}
		}

		return wynik;

	}

	/**
	 * Method calculates sum of even columns
	 * 
	 * @return sum
	 */
	private int parzysteWiersze() {

		int suma = 0;

		for (int i = 0; i < tablica.length; i += 2) {
			for (int j = 0; j < tablica.length; j++) {
				suma = suma + tablica[i][j];
			}
		}

		return suma;
	}

	/**
	 * Method calculates sum of uneven columns
	 * 
	 * @return
	 */
	private int nieparzysteKolumny() {
		int suma = 0;

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 1; j < tablica.length; j += 2) {

				suma = suma + tablica[i][j];
			}

		}

		return suma;

	}

	private int iloczynKomorki() {
		int ilosc = 0;
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica.length; j++) {
				// 1. wylizenie iloczynu wiersza i kolumny
				int iloczyn = i * j;
				// 2. porownaj czy iloczyn wiekszy od wartosci
				boolean porownaj = iloczyn < tablica[i][j];
				// jak wiekszy to dodaj do ilosc
				if (porownaj)
					ilosc += 1;

			}

		}

		return ilosc;
	}

	public static void main(String[] args) {
		Zadanie1 zadanie = new Zadanie1();
		zadanie.initializeTable();

		//
		int[] max = zadanie.getMax();
		System.out.println("Najwieksza wartosc: [" + max[0] + "][" + max[1] + "]");

		System.out.println("Stosunek liczb " + zadanie.parzysteWiersze() + " do " + zadanie.nieparzysteKolumny());

		System.out.println(
				"Liczba kom�rek, kt�rych warto�� jest mniejsza od iloczynu indeksu wiesza i kolumny tej kom�rki to : "
						+ zadanie.iloczynKomorki());
	}
}