package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ExecuteSearchingSorting {

	List<String> firstArrayList = new ArrayList<String>();
	List<String> secondArrayList = new ArrayList<String>();

	public void createList() {
		firstArrayList.add("Apple");
		firstArrayList.add("Grapes");
		firstArrayList.add("Banana");
		firstArrayList.add("Dragon Fruit");
		firstArrayList.add("Orange");
		System.out.println("1st ArrayList Contains: " + firstArrayList);
		
		secondArrayList.add("Apple");
		secondArrayList.add("Grapes");
		secondArrayList.add("Orange");
		secondArrayList.add("Dragon Fruit");
		secondArrayList.add("Banana");
		System.out.println("2nd ArrayList Contains: " + secondArrayList);
	}

	public void searching(String item) {
		int index = firstArrayList.indexOf(item);
		if (index > -1) {
			System.out.println(item + " found at index " + index);
		} else {
			System.out.println(item + " not found in the ArrayList");
		}

	}

	public void cloneArrayList(ArrayList<String> arrayList) {
		List<String> arrayListCloned = (List<String>) arrayList.clone();
		// Collections.copy(copyArrayList, arrayList); --- src and dest should have same size
		System.out.println("ArrayList Contains: " + arrayListCloned);
	}

	// shuffle elements in an array list
	public void shuffleArrayList(List<String> arrayList) {
		System.out.println("ArrayList Contains: " + arrayList);
		Collections.shuffle(arrayList);
		System.out.println("Array Elements after Shuffle: " + arrayList);
	}

	// sort elements in an array list
	public void sortArrayList(List<String> arrayList) {
		System.out.println("ArrayList Contains: " + arrayList);
		Collections.sort(arrayList);
		System.out.println("Array Elements after Sort: " + arrayList);
	}

	// reverse elements in a array list
	public void reverseArrayList(List<String> arrayList) {
		System.out.println("ArrayList Contains: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("Array Elements after Reverse: " + arrayList);
	}

	// extract a portion of a array list
	public void extractPortionOfArrayList(List<String> arrayList) {
		System.out.println("ArrayList Contains: " + arrayList);
		// subList(fromIndex, toIndex) fromIndex is inclusive and toIndex is exclusive
		System.out.println("Array Elements From Index 2 to 4 " + arrayList.subList(2, 4));
	}

	// compare two array list
	public void compareTwoArrayList(List<String> firstArrayList , List<String> secondArrayList) {
		if(firstArrayList.size() == secondArrayList.size()) {
			if(firstArrayList.containsAll(secondArrayList)) {
				System.out.println(firstArrayList + " and " + secondArrayList + " are same");
			}else {
				System.out.println(firstArrayList + " and " + secondArrayList + " are not same");
			}
			
		}else {
			System.out.println(firstArrayList + " and " + secondArrayList + " are not same");
		}
	}
	
	//swap two elements in an array list
	public void swapArrayListElements(List<String> arrayList) {
		System.out.println("ArrayList Contains: " + arrayList);
//		String swap = arrayList.get(2);
//		arrayList.set(2, arrayList.get(4));
//		arrayList.set(4, swap);
		Collections.swap(arrayList, 2, 4);
		System.out.println("After Swapping index 2 and 4 elements in ArrayList: " + arrayList);
		
	}
	
	// Add two array lists
		public void addTwoArrayList(List<String> firstArrayList , List<String> secondArrayList) {
			List<String> mergeredList = new ArrayList<String>();
			System.out.println("First ArrayList Contains: " + firstArrayList);
			System.out.println("Second ArrayList Contains: " + secondArrayList);
			for (String item : firstArrayList) {
				mergeredList.add(item);
			}
			for (String item : secondArrayList) {
				mergeredList.add(item);
			}
			System.out.println("After Joining two ArrayLists: " + mergeredList);			
		}
		
		public void EmptyArrayList(List<String> firstArrayList) {
			System.out.println("First ArrayList Contains: " + firstArrayList);
			firstArrayList.removeAll(firstArrayList);			
			System.out.println("After Empting FirstArrayList: " + firstArrayList);			
		}
		
		public void isArrayListEmpty(List<String> firstArrayList) {
			if(firstArrayList.size() == 0) {
				System.out.println("FirstArrayList is Empty");
			}else {
				System.out.println("FirstArrayList is not Empty");
			}
			if(secondArrayList.isEmpty()) {
				System.out.println("SecondArrayList is Empty");
			}else {
				System.out.println("SecondArrayList is not Empty");
			}			
		}		
}

public class SearchingSortingArrayList {

	public static void main(String[] args) {
		ExecuteSearchingSorting objArrayList = new ExecuteSearchingSorting();
		objArrayList.createList();
		objArrayList.searching("Banana");
		objArrayList.cloneArrayList((ArrayList<String>) objArrayList.firstArrayList);
		objArrayList.shuffleArrayList(objArrayList.firstArrayList);
		objArrayList.sortArrayList(objArrayList.firstArrayList);
		objArrayList.reverseArrayList(objArrayList.firstArrayList);
		objArrayList.extractPortionOfArrayList(objArrayList.firstArrayList);
		objArrayList.compareTwoArrayList(objArrayList.firstArrayList, objArrayList.secondArrayList);
		objArrayList.swapArrayListElements(objArrayList.firstArrayList);
		objArrayList.addTwoArrayList(objArrayList.firstArrayList, objArrayList.secondArrayList);
		objArrayList.EmptyArrayList(objArrayList.firstArrayList);
		objArrayList.isArrayListEmpty(objArrayList.firstArrayList);
	}

}
