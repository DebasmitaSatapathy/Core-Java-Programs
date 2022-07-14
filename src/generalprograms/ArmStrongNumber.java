package generalprograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to check Armstrong: ");
		long num = scanner.nextLong();
		isArmstrongNumber(num);
		scanner.close();
	}
	
	public static void isArmstrongNumber(long num) {
		long cubeTotal = 0;
		long reminder = 0;
		long result = num;
		while(result != 0) {
			reminder = result % 10;
			result = result / 10;
			cubeTotal = (long) (cubeTotal + Math.pow(reminder, 3));
		}
		if(num == cubeTotal) {
			System.out.println(num + " is an Armstrong Number");
		}else {
			System.out.println(num + " is not an Armstrong Number");
		}
	}

}
