package com.workshop.model;

public class Hotel {
	private String name;
	private int regularWeekdayRate;
	private int regularWeekendRate;
	private long totalRates;

	public Hotel() {
	}

	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

	public long getTotalRates() {
		return totalRates;
	}

	public void setTotalRates(long totalRates) {
		this.totalRates = totalRates;
	}

	public long calculateTotalRates(long weekDays, long weekEnds) {
		this.totalRates = weekDays * regularWeekdayRate + weekEnds * regularWeekendRate;
		return totalRates;
	}

	public String toString() {
		return name + ", Total Rates: $" + totalRates;
	}
}
