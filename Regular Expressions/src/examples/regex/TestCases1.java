package examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCases1 {

	public static void main(String[] args) {
		
		final String test1 = "My name is Adams";
		
		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(test1);
		
		// check for the occurrences
		/*while(matcher.find()){
			System.out.println("Start index is " + matcher.start());
			System.out.println("End index is " + matcher.end());
			System.out.println(matcher.group());
			System.out.println();
		}*/
		
		pattern = pattern.compile("\\w+s"); // this pattern means any word followed by an s.
		matcher = pattern.matcher(test1);
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println();
		}
	}
}
