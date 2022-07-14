package lambdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SimpleLambdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(19);
		arrayList.add(26);
		arrayList.add(57);
		arrayList.add(18);
		arrayList.add(16);
			
		System.out.println("ArrayList Elements are");
		arrayList.forEach((n) -> { System.out.println(n); });
		
		//Interface to store Lambda Expression 
		
		Consumer<Integer> consumer = (n) -> { System.out.println(n); }; 
		arrayList.forEach(consumer);

	}

}
