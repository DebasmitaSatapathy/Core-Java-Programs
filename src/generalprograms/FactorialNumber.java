package generalprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to get Factorial : ");
		int input = scanner.nextInt();
		int fact = factorialNumber(input);
		System.out.println("Factorial of " + input + " is " + fact);
		scanner.close();
	}

	public static int factorialNumber(int number) {
		int result = 1;
		if (number == 0 || number == 1) {
			result = 1;
		} else {

			for (int i = 1; i <= number; i++) {
				result = result * i;
			}
		}
		return result;
	}

}
