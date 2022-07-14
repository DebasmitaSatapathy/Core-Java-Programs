package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrayList {

	public static void main(String[] args) {
		
		List<String> firstList = new ArrayList<String>();
		ExecuteListIterator.createStringList(firstList);
		System.out.println("First List Contains..........");
		ExecuteListIterator.traverseStringList(firstList);
		
		List<String> secondList = new ArrayList<String>();
		ExecuteListIterator.createStringSecondList(secondList);
		System.out.println("Second List Contains..........");
		ExecuteListIterator.traverseStringList(firstList);
		
		System.out.println("Common Elements of Two Lists using RetainAll()....." 
															+ commomElementTwoListUsingRetainAll(firstList,secondList) );
		
		System.out.println("Common Elements of Two Lists using Contains()....." 
															+ commomElementTwoListUsingContains(firstList,secondList) );
		
		System.out.println("Common Elements of Two Lists using Contains()....." 
															+ commomElementTwoListUsingStream(firstList,secondList) );
		
		


	}
	
	public static List commomElementTwoListUsingRetainAll(List firstList , List secondList) {		
		firstList.retainAll(secondList);		
		return firstList;		
	}
	
	public static List commomElementTwoListUsingContains(List firstList , List secondList) {		
		
		List<String> commonList = new ArrayList<String>();
		ListIterator<String> iterator = firstList.listIterator();
		String temp = null;
		while(iterator.hasNext()) {
			temp = iterator.next();
			if(secondList.contains(temp)) {
				commonList.add(temp);
			}
		}
		
		return commonList;		
	}
	
public static List commomElementTwoListUsingStream(List firstList , List secondList) {		
		
		firstList.stream().filter(secondList :: contains)
						  .collect(Collectors.toList());
		
		return firstList;		
	}

}
