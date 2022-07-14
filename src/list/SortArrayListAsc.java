package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListAsc {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ListToSubList.createIntegerList(list);
		System.out.println("List Contains..........");
		ListToSubList.traverseIntegerList(list);

		System.out.println("Sorting List in Ascending Order..........");
		list = AscSort(list);
		System.out.println(list);

		list.clear();
		ListToSubList.createIntegerList(list);
		System.out.println("Sorting List in Descending Order..........");
		list = DescSort(list);
		System.out.println(list);
	}

	private static List<Integer> AscSort(List<Integer> list) {

		Collections.sort(list);
		return list;
	}

	private static List<Integer> DescSort(List<Integer> list) {

		// Collections.sort(list,Collections.reverseOrder() ); // 1st way to sort in desc order
		Collections.sort(list); // 2nd way to sort 
		Collections.reverse(list); // in desc order
		return list;
	}

}
