package myPackage;

public class Hotel {
	/*
	 * declaring hotelname, and prize value respectively
	 */
	String hotelName;
	int weekDayForRegular;
	int weekDayForReward;
	int weekendForRegular;
	int weekendForReward;

	Hotel(String hotelName, int weekDayForRegular, int weekDayForReward, int weekendForRegular, int weekendForReward) {
		this.hotelName = hotelName;
		this.weekDayForRegular = weekDayForRegular;
		this.weekDayForReward = weekDayForReward;
		this.weekendForRegular = weekendForRegular;
		this.weekendForReward = weekendForReward;
	}

}
