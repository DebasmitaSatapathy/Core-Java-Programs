package list;

import java.util.Arrays;
import java.util.List;

public class StringToCommaSeparatedList {

	public static void main(String[] args) {
		String string = "Rajveer is a Good Boy";
		System.out.println("String into comma separated List..........");
		System.out.println(commaSeparatedList(string));

	}

	private static List commaSeparatedList(String string) {

		String[] strings = string.split(" ");
		for (String string2 : strings) {
			System.out.println(string2);
		}
		List<String> list = Arrays.asList(strings);
		return list;
	}

}
