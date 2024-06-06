package homework_java;

public class Leap_Years {
 
public static boolean isLeapYear(int year) {
		        if (year % 4 == 0) {
		            if (year % 100 == 0) {
		                if (year % 400 == 0) {
		                    return true;
		                } else {
		                    return false;
		                }
		            } else {
		                return true;
		            }
		        } else {
		            return false;
		        }
		    }

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
		
		//This Java code has a isLeapYear() method that checks if a year is a leap year or not based on the leap year rules. The main() method initializes the starting and ending years (2000 and 2023) and then iterates through the range of years. It calls the isLeapYear() method for each year and prints the leap years.

		//When you run the code, it will output the following:

		}
		
	 






		

	

