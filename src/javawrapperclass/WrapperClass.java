package javawrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer myInt = 100; // creating Wrapper Object
		Double myDouble = 10.34;
		Character myChar = 'A';
		System.out.println("Integer myInt = " + myInt);
		System.out.println("Double myDouble = " + myDouble);
		System.out.println("Character myChar = " + myChar);
		
		System.out.println("Integer myInt = " + myInt.intValue()); // same as direct printing myInt
		System.out.println("Double myDouble = " + myDouble.doubleValue());
		System.out.println("Character myChar = " + myChar.charValue());
		
		String myString = myInt.toString();
		System.out.println("Length of Integer myInt : " + myString.length());

	}

}
