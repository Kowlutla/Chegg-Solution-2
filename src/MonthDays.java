import java.util.Scanner;
public class MonthDays {

	// An integer for the month (1 = January, 2 February, etc.).
	private int month;
	// An integer for the year
	private int year;
	/*
	 * class’s constructor should accept two arguments: An integer for the month (1
	 * = January, 2 February, etc.). An integer for the year
	 */
	public MonthDays(int month, int year) {
		this.month = month;
		this.year = year;
	}
	/*
	 * method named getNumberOfDays that returns the number of days in the specified
	 * month
	 */
	public int getNumberOfDays() {
		int numofdays = 0;
		switch (month) {
			// if the month is 1,3,5,7,8,10,12 number of days are 31
			case 1:case 3:case 5:case 7:case 8:case 10:case 12: {
				numofdays = 31;
				break;
			}
			//// if the month is 4,6,9,11 number of days are 31
			case 4:case 6:case 9:case 11: {
				numofdays = 30;
				break;
			}
			// if month is 2 i.e february
			case 2: {
				// if the year is leap year number of days are 29
				if (isLeap()) {
					numofdays = 29;
				}
				// if the not year is leap year number of days are 28
				else {
					numofdays = 28;
				}
				break;
			}
		}
		// return numofdays
		return numofdays;
	}

	// Helper method to check year is leap or not
	private boolean isLeap() {

		// if year is divided by 4
		if (year % 4 == 0) {
			// the year is divisible by 100
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		} else
			return false;
	}
	
	//Driver Code
	public static void main(String[] args) {
		
		MonthDays monthdays;
		Scanner sc=new Scanner(System.in);
		//asking user to enter month(1-12)
		System.out.print("Enter Month(1-12): ");
		int month=sc.nextInt();
		//asking user to enter year
		System.out.print("Enter year: ");
		int year=sc.nextInt();
		//creating MonthDays Object by passing month and year
		monthdays=new MonthDays(month,year);
		System.out.println(monthdays.getNumberOfDays());
		sc.close();
	}
}
