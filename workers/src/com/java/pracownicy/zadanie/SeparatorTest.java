package com.java.pracownicy.zadanie;

/**
 * @author jaros
 *
 */
public class SeparatorTest  {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		String test = "Jaroslaw|Rajchert|4000|2";
		String []result = test.split("\\|");
		//for (String s : result) {
		String test2 = result[0];
			System.out.println(test2);
		//}

	}

}
