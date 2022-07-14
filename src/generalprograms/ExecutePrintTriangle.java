package generalprograms;

class PrintTriangle {
	
	public void printLeftSideStarTriangle(int level) {
		for(int outerRow =1; outerRow<=level; outerRow++) {
			for(int eachColumn =1; eachColumn<=outerRow; eachColumn++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	public void printRightSideStarTriangle(int level) {
		System.out.println();
		int gap =level;
		for(int outerRow =1; outerRow<=level; outerRow++) {
			for(int space=1;space<=2*(gap-1);space++) {
				System.out.print(" ");
			}
			for(int eachColumn =1; eachColumn<=outerRow; eachColumn++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			gap = gap-1;
		}
	}
	
	public void printMiddleStarTriangle(int level) {
		System.out.println();
		int gap =level;
		for(int outerRow =1; outerRow<=level; outerRow++) {
			for(int space=1;space<=gap-1;space++) {
				System.out.print(" ");
			}
			for(int eachColumn =1; eachColumn<=outerRow; eachColumn++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			gap = gap-1;
		}
	}
}

public class ExecutePrintTriangle {

	public static void main(String[] args) {
		PrintTriangle printTriangle = new PrintTriangle();
		printTriangle.printLeftSideStarTriangle(10);
		printTriangle.printRightSideStarTriangle(10);
		printTriangle.printMiddleStarTriangle(10);
	}

}
