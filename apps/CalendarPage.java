package hackathon2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarPage {

	public static void main(String[] args) {
		
		String[] pageDaysOfWeek = new String[7];
		
		Calendar calendar = new GregorianCalendar(2019, 1, 1);
		calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 5);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int day;
		int dayOfMonth = 1;
		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		if (dayOfWeek == 1) {
			day = 7;
		} else {
			day = dayOfWeek-1;
		}
		
		for (int row = 0;row < 7; row++) {
			if (row == 0) {	
				pageDaysOfWeek[row] = "M";
			} else if (row == 1) {
				pageDaysOfWeek[row] = "T";
			} else if (row == 2) {
				pageDaysOfWeek[row] = "W";
			} else if (row == 3) {
				pageDaysOfWeek[row] = "T";
			} else if (row == 4) {
				pageDaysOfWeek[row] = "F";
			} else if (row == 5) {
				pageDaysOfWeek[row] = "S";
			} else if (row == 6) {
				pageDaysOfWeek[row]  = "S";
			}
		}

		for (int row = 0;  row < 7; row++) {
			System.out.printf("%4s", pageDaysOfWeek[row]);
		}
		System.out.println();
		
		for (int column = 1; column < day; column++) {
			System.out.printf("%4s", " ");
		}
		
		for (int column = day; column <= 7; column++) {
			System.out.printf("%4s", dayOfMonth);
			dayOfMonth++;	
		}
		
		System.out.println();
		for (int row = 1;  row < 5; row++) {
			for (int column = 1; column <= 7; column++) {
				System.out.printf("%4s", dayOfMonth);
				dayOfMonth++;
				if (dayOfMonth > lastDayOfMonth) {
					break;
				}
			}
			System.out.println();
		}

	}

}
