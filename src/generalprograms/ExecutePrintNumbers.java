package generalprograms;

class PrintNumbers {
	
	public void displayName(String name) {
		System.out.println("My Name is " + name);
	}
	
	public void printNumbers(int numLimit) {
		System.out.println("Numbers till " + numLimit);
		for(int num=1;num<=numLimit;num++) {
			System.out.println(num);
		}
		System.out.println();
	}
	
	public void printNumberEachLineLimit(int numLimit,int lineLimit) {
		System.out.println("Numbers till " + numLimit + " Printed with Each Line 15 numbers :");
		for(int num=1;num<=numLimit;num++) {
			System.out.print(num + "   ");
			if(num % lineLimit == 0) {
				System.out.println();
			}			
		}
		System.out.println();
	}
	
	public void printOddNumbers(int startNum, int endNum) {
		System.out.println("Odd Numbers from " + startNum + " to " + endNum);
		for(int num=startNum;num<=endNum;num++) {
			if(num % 2 != 0) {
				System.out.println(num);
			}			
		}
		System.out.println();
	}
	
	public void checkPrimeNumber(int num) {
		if(num<1) {
			System.out.println(num + " is not a valid Number ");
		}else {
			int count=2;
			for(int divident=2;divident<=9;divident++) {
				if(divident != num)
				if(num % divident == 0) {
					count++;
					if(count>2) {
						break;
					}
				}			
			}
			if(count>2) {
				System.out.println(num + " is not a prime Number ");			
			}else {
				System.out.println(num + " is a prime Number ");
			}
		}		
		System.out.println();
	}

}

public class ExecutePrintNumbers {

	public static void main(String[] args) {
		PrintNumbers printNum = new PrintNumbers();
		printNum.displayName("Debasmita Satapathy");
		printNum.printNumbers(100);
		printNum.printNumberEachLineLimit(1000, 15);
		printNum.printOddNumbers(100,200);
		printNum.checkPrimeNumber(13);
	}

}
