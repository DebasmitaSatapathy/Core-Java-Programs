package list;

import java.util.ArrayList;
import java.util.List;

public class ListToCommaSeparatedString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		ExecuteListIterator.createStringList(list);
		System.out.println("List Contains..........");
		ExecuteListIterator.traverseStringList(list);

		System.out.println("List To Comma Separated String..........");
		String string = commaSeparatedString(list);
		System.out.println(string);
		
		System.out.println("List To Double Quote String..........");
		string = doubleQuoteSeparatedString(list);
		System.out.println(string);

	}

	private static String commaSeparatedString(List<String> list) {
		
		String string = String.join(",", list);		
		return string;		
	}
	
private static String doubleQuoteSeparatedString(List<String> list) {
		
		String string = String.join(" ", list);	
		return string;		
	}

}
