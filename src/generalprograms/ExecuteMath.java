package generalprograms;

class MathPrograms {
	public int addition(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

	public int subtract(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

	public int multiply(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	public int division(int firstNum, int secondNum) {
		if(secondNum == 0) {
			return -1;
		}else {
			return firstNum / secondNum;
		}
		
	}
	
	public int power(int firstNum, int secondNum) {
		int sum=1;
		for(int count = 1; count<=secondNum ;count++) {
			sum = sum  * firstNum ;
		}
		return sum;
	}

}

public class ExecuteMath {

	public static void main(String[] args) {
		int result = 0;
		MathPrograms math = new MathPrograms();
		result = math.addition(10,12);
		System.out.println("Addition Result = " + result);
		result = math.subtract(15,12);
		System.out.println("Subtraction Result = " + result);
		result = math.multiply(15,2);
		System.out.println("Multiplication Result = " + result);
		result = math.division(15,4);
		if(result == -1) {
			System.out.println("Division Result = " + "Error: Division by Zero");
		}else {
		System.out.println("Division Result = " + result);
		}
		result = math.power(5,4);
		System.out.println("Power Result = " + result);
	}

}
