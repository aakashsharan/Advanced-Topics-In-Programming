package examples.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCases1 {

	public static void main(String[] args) {

		final String test1 = "My name is Adams";
		final String test2 = "My name is 007";
		final String test3 = "Who is awesome? Floyd. How old is he? 6 months. Wow!";
		final String test4 = "one (1), two (2), three (3)";

		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(test1);

		// check for the occurrences
		while (matcher.find()) {
			System.out.println("Start index is " + matcher.start());
			System.out.println("End index is " + matcher.end());
			System.out.println(matcher.group());
			System.out.println();
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("\\w+s"); // this pattern means any word
											// followed by an s.
		matcher = pattern.matcher(test1);
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println();
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("\\w+s"); // this pattern means any word
											// followed by an s.
		String[] words = pattern.split(test1); // this will remove any word that
												// matches the pattern
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("[^a-zA-Z]"); // any character other than a-z
												// and A-Z
		matcher = pattern.matcher(test2);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("[0-9]+"); // any character from 0-9 and more
		matcher = pattern.matcher(test2);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("[^a-zA-Z|\\s]"); // any character other than
													// a-z and A-Z or a
													// whitespace character
		matcher = pattern.matcher(test2);
		while (matcher.find()) {
			System.out.println(matcher.replaceAll("-"));
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("[^.!?]+"); // a sentence.
		matcher = pattern.matcher(test3);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("[a-zA-Z]+"); // a word.
		matcher = pattern.matcher(test3);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();

		pattern = pattern.compile("(?i)a+"); // a word.
		matcher = pattern.matcher(test3);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("[a-z]+"); // this pattern means any word
		// followed by an s.
		String[] words2 = pattern.split("%one%%two%%%three%%%%"); // this will remove any word that
					// matches the pattern
		for (String w : words2) {
		System.out.println(w);
		}
		System.out.println("**********************************************");
		System.out.println();
		
		ArrayList<String> tokens = new ArrayList<String>();
		pattern = pattern.compile("[a-z()0-9]+"); // a word.
		matcher = pattern.matcher(test4);
		while (matcher.find()) {
			tokens.add(matcher.group());
		}
		System.out.println(tokens);
		System.out.println("**********************************************");
		System.out.println();
		
	}
}
