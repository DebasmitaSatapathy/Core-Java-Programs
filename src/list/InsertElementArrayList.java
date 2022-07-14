package list;

import java.util.ArrayList;
import java.util.List;

public class InsertElementArrayList {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Grapes");
		arrayList.add("Orange");
		arrayList.add(0,"Dragon Fruit"); //add element at first position
		arrayList.add("Banana");
		System.out.println(arrayList);
		System.out.println("Element at index 3 in ArrayList: " + arrayList.get(3)); //retrieve an element (at a specified index)
		System.out.println("ArrayList Before Updation: " + arrayList);
		arrayList.set(2, "Watermelon"); // update specific element by given element 
		System.out.println("ArrayList After Updation at index 2: " + arrayList);
		arrayList.remove(3); //remove the third element from a array list
		System.out.println("ArrayList After removing element at index 3: " + arrayList);				
	}

}
