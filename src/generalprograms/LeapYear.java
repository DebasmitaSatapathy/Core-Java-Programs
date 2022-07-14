package generalprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Year to check Leap Year: ");
		int year = scanner.nextInt();
		boolean checkLeapYear = isLeapYear(year);
		if(checkLeapYear == true) {
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year + " is not a Leap Year");
		}
		
		scanner.close();
	}

	private static boolean isLeapYear(int year) {
		
		boolean checkLeapYear = false;
		if(year % 4 == 0) {
			checkLeapYear = true;
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					checkLeapYear = true;
				}
			}			
		}
		return checkLeapYear;		
	}

}
