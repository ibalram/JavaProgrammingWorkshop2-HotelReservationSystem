package com.workshop.model;

import java.util.ArrayList;

public class HotelReservationSystem {
	private ArrayList<Hotel> hotelList;

	public HotelReservationSystem() {
		this.hotelList = new ArrayList<Hotel>();
	}

	public void addHotel(Hotel hotel) {
		hotelList.add(hotel);
	}

}
