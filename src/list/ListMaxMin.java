package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMaxMin {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		ListToSubList.createIntegerList(list);
		
		System.out.println("List Contains............");
		ListToSubList.traverseIntegerList(list);		
		
		System.out.println();
		
		Integer max=0,min=0;
		
		max = getMaxFromList(list);
		System.out.println("Maximum in the List --> " + max);
		min = getMinFromList(list);
		System.out.println("Minimum in the List --> " + min);		
	}
	
	public static int getMaxFromList(List<Integer> list) {
		if(list == null || list.size() == 0) {
			return Integer.MAX_VALUE;
		}else {
			Collections.sort(list);
			return list.get(0);			
		}
		
	}
	
	public static int getMinFromList(List<Integer> list) {
		if(list == null || list.size() == 0) {
			return Integer.MIN_VALUE;
		}else {
			Collections.sort(list);
			return list.get(list.size()-1);			
		}
		
	}

}
