package com.workshop.model;

import java.text.SimpleDateFormat;
import java.util.*;

public class HotelReservationSystem {
	private SimpleDateFormat date = new SimpleDateFormat("ddMMMyyyy");
	private ArrayList<Hotel> hotelList;

	public HotelReservationSystem() {
		this.hotelList = new ArrayList<Hotel>();
	}

	public void addHotel(Hotel hotel) {
		hotelList.add(hotel);
	}

	public Hotel getCheapestHotel(String checkinDate, String checkoutDate) {
		try {
			Date checkin = date.parse(checkinDate);
			Date checkout = date.parse(checkoutDate);
			long days = (long) ((checkout.getTime() - checkin.getTime()) / (86.4e6)) + 1;
			System.out.println("Days= " + days);
			return hotelList.stream()
					.sorted(Comparator.comparingLong(hotel -> ((Hotel) hotel).calculateTotalRates(days))).findFirst()
					.orElse(null);

		} catch (Exception e) {
			System.out.println("Exception Occured" + e);
		}
		return null;
	}

}
