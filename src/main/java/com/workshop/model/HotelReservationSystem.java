package com.workshop.model;

import java.text.SimpleDateFormat;
import java.util.*;

public class HotelReservationSystem {
	private SimpleDateFormat date = new SimpleDateFormat("ddMMMyyyy");
	private ArrayList<Hotel> hotelList;

	public HotelReservationSystem() {
		this.hotelList = new ArrayList<Hotel>();
		this.addHotel(new Hotel("Lakewood", 110, 90, 3));
		this.addHotel(new Hotel("Bridgewood", 150, 50, 4));
		this.addHotel(new Hotel("Ridgewood", 220, 150, 5));
	}

	public void addHotel(Hotel hotel) {
		hotelList.add(hotel);
	}

	public int getWeekDays(Date startDate, Date endDate) {
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDate);

		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDate);

		int workDays = 0;
		if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
				&& startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			++workDays;
		}
		if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
			startCal.setTime(endDate);
			endCal.setTime(startDate);
		}
		do {
			startCal.add(Calendar.DAY_OF_MONTH, 1);
			if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				++workDays;
			}
		} while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());
		return workDays;
	}

	public Hotel getCheapestHotel(String checkinDate, String checkoutDate) {
		try {
			Date checkin = date.parse(checkinDate);
			Date checkout = date.parse(checkoutDate);
			long days = (long) ((checkout.getTime() - checkin.getTime()) / (86.4e6)) + 1;
			long weekDays = getWeekDays(checkin, checkout);
			long weekEnds = days - weekDays;
			return hotelList.stream()
					.sorted(Comparator.comparingLong(hotel -> ((Hotel) hotel).calculateTotalRates(weekDays, weekEnds)))
					.findFirst().orElse(null);

		} catch (Exception e) {
			System.out.println("Exception Occured" + e);
			return null;
		}
	}

}
