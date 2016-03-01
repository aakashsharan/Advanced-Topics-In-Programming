import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

/*(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
Lincoln.txt.
*/

/**
 * @author Aakash Sharan
 *
 */
public class CountWords {
	public static void main(String[] args) {
		// String URLString = "http://cs.armstrong"; -- throws IOException.
		// String URLString = "httpcs.armstrong.edu/liang/data/Lincoln.txt"; --
		// throws MalformedURLException.
		String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";

		// Call the method to count words.
		int numOfWords = countWordsFromURL(URLString);
		System.out.println("The number of words in the txt file is: " + numOfWords);
	}

	/**
	 * Takes a url and count the number of words from it.
	 * 
	 * @param URLString
	 *            - takes a url string.
	 * @return int - the number of words.
	 * @throws MalformedURLException
	 *             - if the url is not right.
	 * @throws IOException
	 *             - if the file doesn't exists.
	 */
	public static int countWordsFromURL(String URLString) {
		int count = 0;
		try {
			// Create a URL instance.
			java.net.URL url = new java.net.URL(URLString);
			// Create a Scanner.
			Scanner sc = new Scanner(url.openStream());
			// read words from the file.
			while (sc.hasNext()) {
				String words = sc.next();
				count += 1;
			}
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
			System.exit(1);
		} catch (java.io.IOException ex) {
			System.out.println("IO Error: No such file.");
			System.exit(2);
		}
		return count;
	}
}
