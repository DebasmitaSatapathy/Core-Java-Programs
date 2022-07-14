package classprograms;


class OuterClass{
	int x=10;
	
	class InnerClass{
		int y=20;
		public void getX() {
			System.out.println("Outer x: " + x); //access to outerclass attributes
		}
	}
		
}

public class ExecuteInnerClasses {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass(); //creating inner class object
		System.out.println("Outer x= " + outer.x);
		System.out.println("Inner y= " + inner.y);
		inner.getX();			
	}

}
