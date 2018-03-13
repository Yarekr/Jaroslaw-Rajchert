package com.java.pracownicy.zadanie.builder;

/**
 * Builder for Workers
 * 
 * @author jaros
 *
 */
public class Workers {

	private final String name;
	private final String lastName;
	private final String city;
	private final String position;
	private final int salary;
	private final String language;
	private final String tax;
	private final String benefit;

	/**
	 * C'tor
	 * 
	 * @param builder
	 */
	private Workers(Builder builder) {
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.city = builder.city;
		this.position = builder.position;
		this.salary = builder.salary;
		this.language = builder.language;
		this.tax = builder.tax;
		this.benefit = builder.benefit;

	}

	/**
	 * Internal static Builder class
	 * 
	 * @author jaros
	 *
	 */
	public static class Builder {

		private String name;
		private String lastName;
		private String city;
		private String position;
		private int salary;
		private String language;
		private String tax;
		private String benefit;

		// Setters / getters:
		public Builder name(final String name) {
			this.name = name;
			return this;
		}

		public Builder lastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder city(final String city) {
			this.city = city;
			return this;
		}

		public Builder position(final String position) {
			this.position = position;
			return this;

		}

		public Builder salary(final int salary) {
			this.salary = salary;
			return this;

		}

		public Builder language(final String language) {
			this.language = language;
			return this;
		}

		public Builder tax (final String tax) {
			this.tax = tax;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the lastName
	 */
	public String getlastName() {
		return lastName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @return the tax
	 */
	public String getTax() {
		return tax;
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
		buffer.append("Imie: " + this.getName());
		buffer.append(System.lineSeparator());
		buffer.append("Nazwisko: " + this.getlastName());
		buffer.append(System.lineSeparator());
		buffer.append("Miejsce pracy: " + this.getCity());
		buffer.append(System.lineSeparator());
		buffer.append("Stanowisko: " + this.getPosition());
		buffer.append(System.lineSeparator());
		buffer.append("Zarobki: " + this.getSalary()+" PLN");
		buffer.append(System.lineSeparator());
		buffer.append("Jêzyk programowania: " + this.getLanguage());
		buffer.append(System.lineSeparator());
		buffer.append("Koszt uzyskania przychodu: " + this.getTax());
		buffer.append(System.lineSeparator());
		buffer.append("Benefit: " + this.getBenefit());
		buffer.append(System.lineSeparator());
		return buffer.toString();
	}

	
}
