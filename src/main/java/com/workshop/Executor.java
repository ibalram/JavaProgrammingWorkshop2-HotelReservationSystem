package com.workshop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.workshop.model.Hotel;
import com.workshop.model.HotelReservationSystem;

public class Executor {
	static SimpleDateFormat date = new SimpleDateFormat("ddMMMyyyy");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to HotelReservation System");
		System.out.println("----------------------------------");

		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		boolean repeat = true;
		while (repeat) {
			System.out.println(
					"Select Options:\n1 (get cheapest hotel for date range)\n2 (get cheapest best rated hotel for date range)\n3 (get best rated hotel for date range)\n4 (EXIT)");
			int option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case 1:
				getCheapestHotelForDateRange(sc, hotelSystem);
				break;
			case 2:
				getCheapestBestRatedHotelForDateRange(sc, hotelSystem);
				break;
			case 3:
				getBestRatedHotelForDateRange(sc, hotelSystem);
				break;
			case 4:
				repeat = false;
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}

	public static void getCheapestHotelForDateRange(Scanner sc, HotelReservationSystem hotelSystem) {
		System.out.println("Enter the checkin date (ddMMMyyyy): ");
		String checkinDate;
		while (true) {
			checkinDate = sc.nextLine();
			try {
				date.parse(checkinDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the checkout date (ddMMMyyyy): ");
		String checkoutDate;
		while (true) {
			checkoutDate = sc.nextLine();
			try {
				date.parse(checkoutDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the customer type (ddMMMyyyy): ");
		String type;
		while (true) {
			type = sc.nextLine();
			if (validateCustomer(type))
				break;
			System.out.println("Enter valid customer type");
		}

		Hotel cheapestHotel = hotelSystem.getCheapestHotel(checkinDate, checkoutDate, type);
		System.out.println("Cheapest hotel for given date range is: " + cheapestHotel);
	}

	public static void getCheapestBestRatedHotelForDateRange(Scanner sc, HotelReservationSystem hotelSystem) {
		System.out.println("Enter the checkin date (ddMMMyyyy): ");
		String checkinDate;
		while (true) {
			checkinDate = sc.nextLine();
			try {
				date.parse(checkinDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the checkout date (ddMMMyyyy): ");
		String checkoutDate;
		while (true) {
			checkoutDate = sc.nextLine();
			try {
				date.parse(checkoutDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the customer type (ddMMMyyyy): ");
		String type;
		while (true) {
			type = sc.nextLine();
			if (validateCustomer(type))
				break;
			System.out.println("Enter valid customer type");
		}

		Hotel cheapestHotel = hotelSystem.getCheapestBestRatedHotel(checkinDate, checkoutDate, type);
		System.out.println("Cheapest hotel for given date range is: " + cheapestHotel);
	}

	public static void getBestRatedHotelForDateRange(Scanner sc, HotelReservationSystem hotelSystem) {
		System.out.println("Enter the checkin date (ddMMMyyyy): ");
		String checkinDate;
		while (true) {
			checkinDate = sc.nextLine();
			try {
				date.parse(checkinDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the checkout date (ddMMMyyyy): ");
		String checkoutDate;
		while (true) {
			checkoutDate = sc.nextLine();
			try {
				date.parse(checkoutDate);
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid date (ddMMMyyyy): " + e);
			}
		}

		System.out.println("Enter the customer type (ddMMMyyyy): ");
		String type;
		while (true) {
			type = sc.nextLine();
			if (validateCustomer(type))
				break;
			System.out.println("Enter valid customer type");
		}

		Hotel cheapestHotel = hotelSystem.getBestRatedHotel(checkinDate, checkoutDate, type);
		System.out.println("Cheapest hotel for given date range is: " + cheapestHotel);
	}

	public static boolean validateCustomer(String type) {
		return type.equalsIgnoreCase("reward") || type.equalsIgnoreCase("regular");
	}
}
