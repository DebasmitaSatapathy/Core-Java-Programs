package generalprograms;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to get Factorial : ");
		int input = scanner.nextInt();
		int fact = factorialNumber(input);
		System.out.println("Factorial of " + input + " using recursion is " + fact);
		scanner.close();
	}

	public static int factorialNumber(int number) {
		int result = 1;
		if (number == 0 || number == 1) {
			 result = result * 1;
		} else {
			result = number * factorialNumber(number-1);
		}
		return result;
	}

}

