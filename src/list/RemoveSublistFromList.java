package list;

import java.util.ArrayList;
import java.util.List;

public class RemoveSublistFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ListToSubList.createIntegerList(list);
		System.out.println("List Contains..........");
		ListToSubList.traverseIntegerList(list);
		int startIndex = 0 , endIndex = 3;
		list = removeSublist(list,startIndex,endIndex);
		System.out.println("List After Removing Sublist(Index " + startIndex + " to " + endIndex + " ) : " + list );

	}
	
	public static List removeSublist(List list , int startIndex , int endIndex) {
		//list.removeAll(list.subList(startIndex, endIndex+1));
		list.subList(startIndex, endIndex+1).clear();
		System.out.println(list);
		return list;
	}

}
