package myPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*this is main class,
 * it can be used to create obj and 
 * call methods
 */
public class HotelReservation {
	ArrayList<Hotel> list = new ArrayList<Hotel>();// initializing list of Hotel

	// method for adding list of hotels with respctive prize values
	public boolean addHotelLists() {
		list.add(new Hotel("Lakewood", 110, 80, 90, 80, 3));// here weekdays and weekend prizes are added
		list.add(new Hotel("Ridgewood", 220, 100, 150, 40, 4));
		list.add(new Hotel("Bridgewood", 160, 110, 60, 50, 5));
		return true;
	}

	public int findCheapestHotelInWeekDaysForRegularDays(List days) {
		String tempHotelName = list.get(0).hotelName;
		int prize = list.get(0).weekDayForRegular;
		for (int i = 1; i < list.size(); i++) {
			if (prize > list.get(i).weekDayForRegular) {
				prize = list.get(i).weekDayForRegular;
				tempHotelName = list.get(i).hotelName;
			}

		}
		System.out.println(tempHotelName + " and prize is  " + days.size() * prize);
		return (days.size() * prize);// multiplying least prize with number of days in weekdays

	}

	public int findBestRatedCheapestForRewardWeekends(List days) {// this method will send cheapest and best rated for
																	// reward customer

		String tempHotelName = list.get(0).hotelName;
		int prize = list.get(0).weekendForReward;
		for (int i = 1; i < list.size(); i++) {
			if (prize > list.get(i).weekendForReward) {
				prize = list.get(i).weekendForReward;
				tempHotelName = list.get(i).hotelName;
			}

		}
		System.out.println(tempHotelName + " and prize is  " + days.size() * prize);
		return (days.size() * prize);// multiplying least prize with number of days in weekdays

	}

	public int findCheapestHotelInWeekendsForRegularDays(List days) {
		String tempHotelName = list.get(0).hotelName;
		int prize = list.get(0).weekendForRegular;
		for (int i = 1; i < list.size(); i++) {
			if (prize > list.get(i).weekendForRegular) {
				prize = list.get(i).weekendForRegular;
				tempHotelName = list.get(i).hotelName;
			}

		}
		System.out.println(tempHotelName + " and prize is  " + days.size() * prize);
		return (days.size() * prize);// multiplying least prize with number of days in weekdays

	}

	public int findBestRatedCheapestForRewardWeekdayss(List days) {// this method will send cheapest and best rated for
																	// reward customer

		String tempHotelName = list.get(0).hotelName;
		int prize = list.get(0).weekDayForReward;
		for (int i = 1; i < list.size(); i++) {
			if (prize > list.get(i).weekDayForReward) {
				prize = list.get(i).weekDayForReward;
				tempHotelName = list.get(i).hotelName;
			}

		}
		System.out.println(tempHotelName + " and prize is  " + days.size() * prize);
		return (days.size() * prize);// multiplying least prize with number of days in weekdays

	}

	public static void main(String[] args) {
		List<String> days = new ArrayList<String>();
		HotelReservation obj1 = new HotelReservation();// creating object of HotelResrvation
		obj1.addHotelLists();// calling function to add details
		days.add("11sep2020");
		days.add("12sep2020");
		// obj1.findCheapestHotelInWeekDaysForRegularDays(days);
		obj1.findBestRatedCheapestForRewardWeekdayss(days);
	}

}
