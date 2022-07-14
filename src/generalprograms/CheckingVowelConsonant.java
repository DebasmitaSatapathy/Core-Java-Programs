package generalprograms;

import java.util.Scanner;

public class CheckingVowelConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Letter to check Vowel Or Consonant ");
		char input = scanner.next().charAt(0);
		isVowelConsonant(input);		
		scanner.close();
	}

	public static void isVowelConsonant(char alphabet) {

		char alphabetCaseInsensitive = Character.toLowerCase(alphabet);
		switch (alphabetCaseInsensitive) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(alphabet + " is a vowel");
			break;
		default:
			System.out.println(alphabet + " is a consonant");
			break;
		}
	}
}
