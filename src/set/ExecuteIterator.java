package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExecuteIterator {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Grapes");
		set.add("Banana");
		set.add("Dragon Fruit");
		set.add("Orange");
		System.out.println("Set Contains: " + set);	
		
		Iterator<String> iterator = null;
		iterator = set.iterator(); //Iterator is used to traverse Set
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println("Set Contains after remove: " + set);
//		
//		for (String setElement : set) {
//			System.out.println(setElement);
//			set.remove(setElement); // java.util.ConcurrentModificationException
//		}
		
		
		/*Note: Trying to remove items using a for loop or a for-each loop would not work correctly
		because the collection is changing size at the same time that the code is trying to loop.*/

	}

}
