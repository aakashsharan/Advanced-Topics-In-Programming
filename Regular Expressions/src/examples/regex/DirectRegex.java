package examples.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DirectRegex {
	public static void main(String[] args) {
		final String input = "red addidas";
		
		List<String> patternList = new ArrayList<String>();
		List<String> foundList = new ArrayList<String>();
		patternList.add("red");
		patternList.add("green");
		patternList.add("addidas");
		
		try{
			for(String p: patternList){
				Pattern pat = Pattern.compile(p);
				Matcher m = pat.matcher(input);
				while(m.find()){
					foundList.add(m.group());
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		for(String s: foundList){
			System.out.println("out " + s);
		}
		
		/*Pattern pattern = Pattern.compile(text1);
		Matcher m = pattern.matcher("redaddidas");
		String found = null;
		while(m.find()){
			 found = m.group();
		}
		System.out.println(found);*/
	}
}
