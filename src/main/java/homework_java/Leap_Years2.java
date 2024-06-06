package homework_java;

public class Leap_Years2 {

	public static void main(String[] args) {

		  int startYear = 2000;
		  int endYear = 2023;
		        

		        System.out.println("Leap years between " + startYear + " and " + endYear + ":");

		        for (int year = startYear; year <= endYear; year++) {
		            if (isLeapYear(year)) {
		                System.out.println(year);
		            }
		        }
		    }

		    public static boolean isLeapYear(int year) {
		        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
		    }
		
		
	}

