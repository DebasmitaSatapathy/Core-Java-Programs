package classprograms;

class OuterClass2{
		
	static class StaticInnerClass{
		int y=20;
		public void getX() {
			//System.out.println("Outer x: " + x); //cannot access to outerclass attributes from static innerclass
		}
	}		
}

public class ExecuteStaticInnerClass {

	public static void main(String[] args) {
			OuterClass2.StaticInnerClass staticInner = new OuterClass2.StaticInnerClass();
			System.out.println("Static Inner y: " + staticInner.y);
			staticInner.getX();
		}
}
