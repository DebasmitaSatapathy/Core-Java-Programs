package classprograms;

import java.util.Scanner;

public class SystemInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter Salary: ");
		double salary = scanner.nextDouble();
		
		System.out.println("Name: " + name);//IF ENTERED WRONG TYPE INPUT --- java.util.InputMismatchException
		System.out.println("Name: " + age);
		System.out.println("Name: " + salary);
	}
}
