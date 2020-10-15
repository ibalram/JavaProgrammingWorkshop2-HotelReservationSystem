package com.workshop;

import java.util.Scanner;

import com.workshop.model.Hotel;
import com.workshop.model.HotelReservationSystem;

public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to HotelReservation System");
		System.out.println("----------------------------------");

		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		boolean repeat = true;
		while (repeat) {
			System.out.println("Select Options:\n1 (get cheapest hotel for date range)\n2 (EXIT)");
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				getCheapestHotelForDateRange(sc, hotelSystem);
				break;
			case 2:
				repeat = false;
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}

	public static void getCheapestHotelForDateRange(Scanner sc, HotelReservationSystem hotelSystem) {
		System.out.println("Enter the checkin date: ");
		String checkinDate = sc.nextLine();

		System.out.println("Enter the checkout date: ");
		String checkoutDate = sc.nextLine();

		Hotel cheapestHotel = hotelSystem.getCheapestHotel(checkinDate, checkoutDate);
		System.out.println("Cheapest hotel for given date range is: " + cheapestHotel);
	}
}
