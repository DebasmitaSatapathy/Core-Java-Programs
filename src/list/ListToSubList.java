package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListToSubList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		createIntegerList(list);
		
		System.out.println("List Contains: ");
		traverseIntegerList(list);
		
		System.out.println();
		List<Integer> subList = list.subList(2, 5);		
		System.out.println("SubList Contains............");
		traverseIntegerList(subList);

	}
	
	public static void traverseIntegerList(List<Integer> list) {

		ListIterator<Integer> listIterator = null;
		listIterator = list.listIterator(); // ListIterator/Iterator is used to traverse List		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
	
	public static void backwardTraverseIntegerList(List<Integer> list) {

		ListIterator<Integer> listIterator = null;
		listIterator = list.listIterator(); // ListIterator/Iterator is used to traverse List
		//System.out.println("Backward Traverse ArrayList Contains: ");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
	
	public static void createIntegerList(List<Integer> list) {
		
		list.add(102);
		list.add(203);
		list.add(502);
		list.add(203);
		list.add(111);
		list.add(902);
		list.add(111);
	}

}
