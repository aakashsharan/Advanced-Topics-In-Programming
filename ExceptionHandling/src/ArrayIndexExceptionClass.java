import java.util.Random;
import java.util.Scanner;

/*(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
- Creates an array with 100 randomly chosen integers.
- Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.*/

public class ArrayIndexExceptionClass {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int[] arrayData = new int[100];

		for (int i = 0; i < arrayData.length; i++) {
			int num = randomNumber.nextInt(100) + 1;
			arrayData[i] = num;
		}

		try {
			System.out.println("Please enter an index value to retrieve the data:");
			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();

			int indexData = arrayData[index];
			System.out.println("The data at index " + index + " is: " + indexData);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please enter a valid index");
		}
		System.out.println("Execution ends");
	}

}
