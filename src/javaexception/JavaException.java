package javaexception;

public class JavaException {
	
	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Access Denied");
		}else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		try {
			int[] myArray  = {12,45,34};
			System.out.println(myArray[5]);
		} catch (Exception e) {
			System.out.println("Something Wrong");
			//throw new IndexOutOfBoundsException("Array Out Of Bound"); // After throw no execution of code except finally block
		}finally {
			System.out.println("Try Catch Block Finished"); // The finally statement lets you execute code, after try...catch, regardless of the result 
		}
		checkAge(8);
	}

}
