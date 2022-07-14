package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExecuteListIterator {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		createStringList(arrayList);
		System.out.println("List Contains: ");
		traverseStringList(arrayList);
		System.out.println("Backward Traverse ArrayList Contains: ");
		backwardTraverseStringList(arrayList);
	}

	public static void traverseStringList(List<String> list) {

		ListIterator<String> listIterator = null;
		listIterator = list.listIterator(); // ListIterator/Iterator is used to traverse List
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

	public static void backwardTraverseStringList(List<String> list) {

		ListIterator<String> listIterator = null;
		listIterator = list.listIterator(); // ListIterator/Iterator is used to traverse List
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

	public static void createStringList(List<String> list) {

		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("Dragon Fruit");
		list.add("Orange");
	}

	public static void createStringSecondList(List<String> list) {

		list.add("Kiwi");
		list.add("Mango");
		list.add("Apple");
		list.add("Dragon Fruit");
		list.add("Berry");
	}

}
