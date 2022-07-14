package generalprograms;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Number for LCM.........");
		System.out.print("Enter First Number:");
		int firstNum = scanner.nextInt();
		System.out.print("Enter Second Number:");
		int secondNum = scanner.nextInt();
		lcmOfTwoNumber(firstNum,secondNum);
		scanner.close();
	}
	
	public static void lcmOfTwoNumber(int firstNum , int secondNum) {
		int largeNum = (firstNum > secondNum) ? firstNum : secondNum;
		int lcm = largeNum;
		while(true) {
			if(lcm % firstNum == 0 && lcm % secondNum == 0) {
				System.out.println("LCM of " + firstNum + " and " + secondNum + " is " + lcm);
				break;
			}
			lcm = lcm + largeNum;
		}
	}

}
