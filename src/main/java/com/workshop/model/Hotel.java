package com.workshop.model;

public class Hotel {
	private String name;
	private int regularRate;
	private long totalRates;

	public Hotel() {
	}

	public Hotel(String name, int regularRate) {
		this.name = name;
		this.regularRate = regularRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularRate() {
		return regularRate;
	}

	public void setRegularRate(int rate) {
		this.regularRate = rate;
	}
	
	public long calculateTotalRates(long days) {
		this.totalRates = days*regularRate;
		return totalRates;
	}

	public String toString() {
		return name + ", Total Rates: $" + totalRates;
	}
}
