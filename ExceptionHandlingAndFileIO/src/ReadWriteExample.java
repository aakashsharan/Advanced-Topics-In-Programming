import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/*(Write/read data) Write a program to create a file named readwrite.txt if
it does not exist. Write 100 integers created randomly into the file using text
I/O. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order.*/

/**
 * @author Aakash Sharan
 *
 */
public class ReadWriteExample {
	public static void main(String[] args) {
		String fileName = "readwrite.txt";
		java.io.File rwFile = new java.io.File(fileName);
		if (rwFile.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		Random randomNumber = new Random();
		// Create a file.
		try (java.io.PrintWriter output = new java.io.PrintWriter(rwFile);) {
			// write output to the file.
			for (int i = 0; i < 100; i++) {
				int num = randomNumber.nextInt(100) + 1;
				output.println(num);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// read from the file.
		readFromFile(fileName);

	}

	/** Reads from a file.
	 * @param file -  Takes a string, which is the filename.
	 * @throws FileNotFoundException - if the file doesn't exist.
	 */
	public static void readFromFile(String file) {
		// Create a file instance.
		java.io.File rwFile = new java.io.File(file);
		// Create a scanner for the file.
		try (Scanner sc = new Scanner(rwFile);) {
			// Read date from the file.
			while (sc.hasNext()) {
				int num = sc.nextInt();
				System.out.println("number is: " + num);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}

	}

}
