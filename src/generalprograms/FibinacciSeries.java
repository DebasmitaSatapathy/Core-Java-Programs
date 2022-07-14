package generalprograms;

public class FibinacciSeries {

	public static void main(String[] args) {
		printFibinacci(10);
	}	

	public static void printFibinacci(int length) {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		System.out.println("Fibonacci Series of length " + length + ".........");
		System.out.print(firstNum + " " + secondNum + " ");
		for(int i=3 ; i<=length ; i++) {
			thirdNum = firstNum + secondNum;
			System.out.print(thirdNum + " ");
			firstNum = secondNum;
			secondNum = thirdNum;			
		}
	}

}
