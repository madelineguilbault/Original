/**
 * 
 */

/**
 * @author madelineguilbault
 *
 */

import java.util.Scanner;

public class date {
	private String month;
	private int day;
	private int year; // a four digit number.

	public Date( )
    {
        month = "January";
        day = 1;
        year = 1000;
    }

	public Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }

	public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

	public Date(int year)
    {
        setDate(1, 1, year);
    }

	public Date(Date aDate)
    {
        if (aDate == null)//Not a real date.
        {
             System.out.println("Fatal Error.");
             System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

	public void setDate(int monthInt, int day, int year) {
		if (dateOK(monthInt, day, year)) {
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setDate(String monthString, int day, int year) {
		if (dateOK(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setDate(int year) {
		setDate(1, 1, year);
	}

	public void setYear(int year) {
		if ((year < 1000) || (year > 9999)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			this.year = year;
	}
	public void setMonth(int monthNumber) {
		if ((monthNumber <= 0) || (monthNumber > 12)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			month = monthString(monthNumber);
	}

	public void setDay(int day) {
		if ((day <= 0) || (day > 31)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			this.day = day;
	}

	public int getMonth() {
		System.out.println(
			    switch (month) {
			        case January  -> 0;
			        case February -> 1;
			        case March -> 2;
			        case April -> 3;
			        case May -> 4;
			        case June-> 5;
			        case July -> 6;
			        case August -> 7;
			        case September -> 8;
			        case October -> 9;
			        case November -> 10;
			        case December -> 11;
			        default      -> {
			            int k = month.toString().length();
			            int result = fn(k);
			            yield result;
			        }
			    } );
	

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return (month + " " + day + ", " + year);
	}

	public boolean equals(Date otherDate) {
		return ((month.equals(otherDate.month)) && (day == otherDate.day)
				&& (year == otherDate.year));
	}

	public boolean precedes(Date otherDate) {
		return ((year < otherDate.year)
				|| (year == otherDate.year && getMonth() < otherDate.getMonth())
				|| (year == otherDate.year && month.equals(otherDate.month)
						&& day < otherDate.day));
	}

	public void readInput() {
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("Enter month, day, and year.");
			System.out.println("Do not use a comma.");
			String monthInput = keyboard.next();
			var dayInput = keyboard.nextVar();
			var  yearInput = keyboard.nextVar();
			if (dateOK(monthInput, dayInput, yearInput)) {
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			} else
				System.out.println("Illegal date. Reenter input.");
		}
	}

	private boolean dateOK(int monthInt, int dayInt, int yearInt) {
		return ((monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1)
				&& (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
	}

	private boolean dateOK(String monthString, int dayInt, int yearInt) {
		return (monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31)
				&& (yearInt >= 1000) && (yearInt <= 9999));
	}

	private boolean monthOK(String month) {
		return 
				System.out.println(
					    switch (month) {
					        case 0  -> January;
					        case 1 -> February;
					        case 2 -> March;
					        case 3 -> April;
					        case 4 -> May;
					        case 5 -> June;
					        case 6 -> July;
					        case 7 -> August;
					        case 8 -> September;
					        case 9 -> October;
					        case 10 -> November;
					        case 11 -> December;
					        default      -> {
					            int k = month.toString().length();
					            int result = fn(k);
					            yield result;
					        }
					    } );
	}

	private String monthString(int monthNumber) {
		System.out.println(
				switch (monthNumber) {
				        case January  -> 0;
				        case February -> 1;
				        case March -> 2;
				        case April -> 3;
				        case May -> 4;
				        case June-> 5;
				        case July -> 6;
				        case August -> 7;
				        case September -> 8;
				        case October -> 9;
				        case November -> 10;
				        case December -> 11;
				        default      -> {
				            int k = month.toString().length();
				            int result = fn(k);
				            yield result;
				        }
				    } );
	}
