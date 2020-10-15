package com.workshop;

import org.junit.Test;

import com.workshop.model.HotelReservationSystem;

import static org.junit.Assert.*;

public class HotelReservationSystemTest {
	@Test
	public void testGetCheapestHotelForDateRange() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Lakewood, Rating: 3 and Total Rates: $220", obj.getCheapestHotel("10Sep2020", "11Sep2020", "Regular").toString());
	}
	
	@Test
	public void testGetCheapestHotelForDateRangeWithWeekends() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Lakewood, Rating: 3 and Total Rates: $200", obj.getCheapestHotel("11Sep2020", "12Sep2020", "Regular").toString());
	}
	
	@Test
	public void testGetCheapestHotelForDateRangeWithWeekendsWithBestRating() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Bridgewood, Rating: 4 and Total Rates: $200", obj.getCheapestBestRatedHotel("11Sep2020", "12Sep2020", "Regular").toString());
	}
	
	@Test
	public void testGetBestRatedHotelForDateRangeWithWeekends() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Ridgewood, Rating: 5 and Total Rates: $370", obj.getBestRatedHotel("11Sep2020", "12Sep2020", "Regular").toString());
	}
}
