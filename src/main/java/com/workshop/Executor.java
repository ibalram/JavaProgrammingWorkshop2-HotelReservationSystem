package com.workshop;

import com.workshop.model.Hotel;
import com.workshop.model.HotelReservationSystem;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to HotelReservation System");
		System.out.println("----------------------------------");

		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		hotelSystem.addHotel(new Hotel("Lakewood", 110));
		hotelSystem.addHotel(new Hotel("Bridgewood", 160));
		hotelSystem.addHotel(new Hotel("Ridgewood", 220));
		System.out.println("Hotels are added");
	}
}
