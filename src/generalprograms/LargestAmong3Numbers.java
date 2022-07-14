package generalprograms;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		largestAmong3Num(98,67,105);
	}
	
	public static void largestAmong3Num(int firstNum , int secondNum , int thirdNum) {
		
		if(firstNum > secondNum && firstNum > thirdNum) {
			System.out.println(firstNum + " is largest among " + firstNum + ", " + secondNum + " and " + thirdNum);
		}else if (secondNum > firstNum  && secondNum > thirdNum) {
			System.out.println(secondNum + " is largest among " + firstNum + ", " + secondNum + " and " + thirdNum);
		}else {
			System.out.println(thirdNum + " is largest among " + firstNum + ", " + secondNum + " and " + thirdNum);
		}
	}

}
