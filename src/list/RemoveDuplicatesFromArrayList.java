package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ListToSubList.createIntegerList(list);
		System.out.println("List Contains..........");
		ListToSubList.traverseIntegerList(list);
		
		System.out.println("List After Removing Duplicates Using LinkedHashSet : " + removeDuplicatesUsingHashSet(list));
		
		System.out.println("List After Removing Duplicates Using ListIterator : " + removeDuplicatesUsingListIterator(list));
		
		System.out.println("List After Removing Duplicates Using ListIterator : " + removeDuplicatesUsingStream(list));
		
	}

	public static List removeDuplicatesUsingHashSet(List list) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		return list;
	}

	public static List removeDuplicatesUsingListIterator(List list) {

		List<Integer> tempList = new ArrayList<Integer>();
		ListIterator<Integer> iterator = list.listIterator();
		int temp;
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (!tempList.contains(temp)) {
				tempList.add(temp);
			}
		}
		return tempList;
	}
	
	public static List removeDuplicatesUsingStream(List list) {
		list.stream().distinct().collect(Collectors.toList());		
		return list;
	}

}
