package com.java.pracownicy.zadanie.builder;

/**
 * Builder for Workers
 * 
 * @author jaros
 *
 */
public class Workers {

	private final String imie;
	private final String nazwisko;
	private final String miasto;
	private final String stanowisko;
	private final int zarobki;
	private final String jezyk;
	private final String autorskie;
	private final String benefit;

	/**
	 * C'tor
	 * 
	 * @param builder
	 */
	private Workers(Builder builder) {
		this.imie = builder.imie;
		this.nazwisko = builder.nazwisko;
		this.miasto = builder.miasto;
		this.stanowisko = builder.stanowisko;
		this.zarobki = builder.zarobki;
		this.jezyk = builder.jezyk;
		this.autorskie = builder.autorskie;
		this.benefit = builder.benefit;

	}

	/**
	 * Internal static Builder class
	 * 
	 * @author jaros
	 *
	 */
	public static class Builder {

		private String imie;
		private String nazwisko;
		private String miasto;
		private String stanowisko;
		private int zarobki;
		private String jezyk;
		private String autorskie;
		private String benefit;

		// Setters / getters:
		public Builder imie(final String imie) {
			this.imie = imie;
			return this;
		}

		public Builder nazwisko(final String nazwisko) {
			this.nazwisko = nazwisko;
			return this;
		}

		public Builder miasto(final String miasto) {
			this.miasto = miasto;
			return this;
		}

		public Builder stanowisko(final String stanowisko) {
			this.stanowisko = stanowisko;
			return this;

		}

		public Builder zarobki(final int zarobki) {
			this.zarobki = zarobki;
			return this;

		}

		public Builder jezyk(final String jezyk) {
			this.jezyk = jezyk;
			return this;
		}

		public Builder autorskie(final String autorskie) {
			this.autorskie = autorskie;
			return this;

		}

		public Builder benefit(final String benefit) {
			this.benefit = benefit;
			return this;
		}

		public Workers build() {
			return new Workers(this);
		}

	}

	/**
	 * @return the imie
	 */
	public String getImie() {
		return imie;
	}

	/**
	 * @return the nazwisko
	 */
	public String getNazwisko() {
		return nazwisko;
	}

	/**
	 * @return the miasto
	 */
	public String getMiasto() {
		return miasto;
	}

	/**
	 * @return the stanowisko
	 */
	public String getStanowisko() {
		return stanowisko;
	}

	/**
	 * @return the zarobki
	 */
	public int getZarobki() {
		return zarobki;
	}

	/**
	 * @return the jezyk
	 */
	public String getJezyk() {
		return jezyk;
	}

	/**
	 * @return the autorskie
	 */
	public String getAutorskie() {
		return autorskie;
	}

	/**
	 * @return the benefit
	 */
	public String getBenefit() {
		return benefit;
	}

	/**
	 * To String override method is used to display Workers as multiple line string
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(System.lineSeparator());
		buffer.append("Imie: " + this.getImie());
		buffer.append(System.lineSeparator());
		buffer.append("Nazwisko: " + this.getNazwisko());
		buffer.append(System.lineSeparator());
		buffer.append("Miejsce pracy: " + this.getMiasto());
		buffer.append(System.lineSeparator());
		buffer.append("Stanowisko: " + this.getStanowisko());
		buffer.append(System.lineSeparator());
		buffer.append("Zarobki: " + this.getZarobki()+" PLN");
		buffer.append(System.lineSeparator());
		buffer.append("Jêzyk programowania: " + this.getJezyk());
		buffer.append(System.lineSeparator());
		buffer.append("Koszt uzyskania przychodu: " + this.getAutorskie());
		buffer.append(System.lineSeparator());
		buffer.append("Benefit: " + this.getBenefit());
		buffer.append(System.lineSeparator());
		return buffer.toString();
	}
}
