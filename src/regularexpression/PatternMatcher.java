package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		String myString = "Rajveer is a good boy";
		String searchString = "Good";
		Pattern pattern = Pattern.compile(searchString,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(myString);
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("\'" + searchString + "\'" + " is present in " + "\'" + myString + "\'" );
		}else {
			System.out.println("\'" + searchString + "\'" + " is not present in " + "\'" + myString + "\'" );
		}
		
		myString = "Sunday_Monday_Tuesday";
		searchString = "Mon";
		
		pattern = Pattern.compile(searchString,Pattern.LITERAL);
		matcher = pattern.matcher(myString);
		matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("'" + searchString + "'" + " is present in " + "'" + myString + "'" );
		}else {
			System.out.println("'" + searchString + "'" + " is not present in " + "'" + myString + "'" );
		}

	}

}
