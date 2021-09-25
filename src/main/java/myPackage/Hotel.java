package myPackage;

public class Hotel {
	/*
	 * declaring hotelname, and prize value respectively
	 */
	String hotelName;
	int weekDayForRegular;
	int weekDayForReward;// rates for reward customer during weekday
	int weekendForRegular;
	int weekendForReward;// rates for reward customer during weekends
	int rating;

	Hotel(String hotelName, int weekDayForRegular, int weekDayForReward, int weekendForRegular, int weekendForReward,
			int rating) {
		this.hotelName = hotelName;
		this.weekDayForRegular = weekDayForRegular;
		this.weekDayForReward = weekDayForReward;
		this.weekendForRegular = weekendForRegular;
		this.weekendForReward = weekendForReward;
		this.rating = rating;
	}

}
