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
		list.add(new Hotel("Lakewood", 110, 80, 90, 80));//here weekdays and weekend prizes are added
		list.add(new Hotel("Ridgewood", 220, 100, 150, 40));
		list.add(new Hotel("Bridgewood", 160, 110, 60, 50));
		return true;
	}
	public int findCheapestHotelInWeekDaysForRegularDays(List arr) {
		return(arr.size()*list.get(0).weekDayForRegular);//multiplying least prize with number of days in weekdays
		
	}
	public static void main(String[] args) {
		List<String> days=new ArrayList<String>();
		HotelReservation obj1 = new HotelReservation();// creating object of HotelResrvation
		obj1.addHotelLists();// calling function to add details
		days.add("10sep2020");
		days.add("11sep2020");
		System.out.println(obj1.findCheapestHotelInWeekDaysForRegularDays(days));
	}
	
	
}
