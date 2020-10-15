package com.workshop;

import org.junit.Test;

import com.workshop.model.HotelReservationSystem;

import static org.junit.Assert.*;

public class HotelReservationSystemTest {
	@Test
	public void testGetCheapestHotelForDateRange() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Lakewood, Total Rates: $220", obj.getCheapestHotel("10Sep2020", "11Sep2020").toString());
	}
	
	@Test
	public void testGetCheapestHotelForDateRangeWithWeekends() {
		HotelReservationSystem obj  = new HotelReservationSystem();
		assertEquals("Lakewood, Total Rates: $200", obj.getCheapestHotel("11Sep2020", "12Sep2020").toString());
	}
}
