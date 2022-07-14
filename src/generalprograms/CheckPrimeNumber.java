package generalprograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check Prime: ");
		int num = scanner.nextInt();
		isPrime(num);
		scanner.close();
	}

	public static void isPrime(int num) {
		if (num == 0 || num == 1) {
			System.out.println(num + " is neither Prime nor Composite");
		} else {
			int count = 2;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count > 2) {
				System.out.println(num + " is not a Prime Number");
			} else {
				System.out.println(num + " is a Prime Number");
			}
		}
	}

}
