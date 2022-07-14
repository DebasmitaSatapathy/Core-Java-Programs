package list;

import java.util.ArrayList;
import java.util.List;

public class ListToTwoHalf {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ListToSubList.createIntegerList(list);
		System.out.println("List Contains..........");
		ListToSubList.traverseIntegerList(list);
		List[] lists =  splitListToHalf(list);
		System.out.println("Size" + list.size());
		System.out.println("1st Half List" + lists[0]);
		System.out.println("2nd Half List" + lists[1]);
	}

	public static List[] splitListToHalf(List<Integer> list) {
		int size = list.size();
		List<Integer> firstList = list.subList(0, size/2);
		List<Integer> secondList = list.subList(size/2 , size);
		
		return new List[] {firstList , secondList}; 
		
	}

}
