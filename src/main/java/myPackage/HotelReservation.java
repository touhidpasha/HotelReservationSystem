package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
	ArrayList<Hotel> list = new ArrayList<Hotel>();// initializing list of Hotel

	public boolean addHotelLists() {// method for adding list of hotels with respctive prize values
		list.add(new Hotel("Lakewood", 110, 80, 90, 80));
		list.add(new Hotel("Ridgewood", 220, 100, 150, 40));
		list.add(new Hotel("Bridgewood", 160, 110, 60, 50));
		return true;
	}

	public static void main(String[] args) {
		HotelReservation obj1 = new HotelReservation();// creating object of HotelResrvation
		obj1.addHotelLists();// calling function to add details

	}
}
