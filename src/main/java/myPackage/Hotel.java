package myPackage;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Hotel {
	/*declaring hotelname,
	 * and prize value respectively
	 */
	String hotelName;
	int weekDayForRegular;
	int weekDayForReward;
	int weekendForRegular;
	int weekendForReward;

	Hotel(String hotelName, int weekDayForRegular, int weekDayForReward, int weekendForRegular, int weekendForReward) {// constructor
																														// method
																														// to
																														// assign
																														// objects
		this.hotelName = hotelName;
		this.weekDayForRegular = weekDayForRegular;
		this.weekDayForReward = weekDayForReward;
		this.weekendForRegular = weekendForRegular;
		this.weekendForReward = weekendForReward;
	}

}
