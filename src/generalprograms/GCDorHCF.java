package generalprograms;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Number for GCD.........");
		System.out.print("Enter First Number:");
		int firstNum = scanner.nextInt();
		System.out.print("Enter Second Number:");
		int secondNum = scanner.nextInt();
		int gcd = gcdOfTwoNumber(firstNum,secondNum);
		System.out.println("GCD of " + firstNum + " and " + secondNum + " is " + gcd);
		scanner.close();
	}
	
	public static int gcdOfTwoNumber(int firstNum , int secondNum) {
		if(secondNum == 0) {
			return firstNum;
		}else {
			return gcdOfTwoNumber(secondNum, firstNum % secondNum);
		}
	}

}
