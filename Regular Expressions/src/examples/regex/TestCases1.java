package examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCases1 {

	public static void main(String[] args) {
		
		final String test1 = "My name is Adams";
		final String test2 = "My name is 007";
		
		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(test1);
		
		// check for the occurrences
		while(matcher.find()){
			System.out.println("Start index is " + matcher.start());
			System.out.println("End index is " + matcher.end());
			System.out.println(matcher.group());
			System.out.println();
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("\\w+s"); // this pattern means any word followed by an s.
		matcher = pattern.matcher(test1);
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println();
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("\\w+s"); // this pattern means any word followed by an s.
		String[] words = pattern.split(test1); // this will remove any word that matches the pattern
		for(String w: words){
			System.out.println(w);
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("[^a-zA-Z]"); // any character other than a-z and A-Z
		matcher = pattern.matcher(test2);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("[0-9]+"); // any character from 0-9 and more
		matcher = pattern.matcher(test2);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		System.out.println("**********************************************");
		System.out.println();
		
		pattern = pattern.compile("[^a-zA-Z|\\s]"); // any character other than a-z and A-Z or a whitespace character
		matcher = pattern.matcher(test2);
		while(matcher.find()){
			System.out.println(matcher.replaceAll("-"));
		}
	}
}
