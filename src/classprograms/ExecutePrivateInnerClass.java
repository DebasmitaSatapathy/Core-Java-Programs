package classprograms;

class OuterClass1{
	int x=10;
	
	private class PrivateInnerClass{
		int z=20;
		private void getX() {
			System.out.println("Outer x: " + x); //access to outerclass attributes
		}
	}
	
	PrivateInnerClass obj = new PrivateInnerClass();
	public void add() {
		System.out.println("Outer x + PrivateInner = " + (x + obj.z));
		obj.getX();
	}
	
}

public class ExecutePrivateInnerClass {

	public static void main(String[] args) {
			OuterClass1 outer = new OuterClass1();
			System.out.println("Outer x= " + outer.x);
			outer.add();			
		}
}

