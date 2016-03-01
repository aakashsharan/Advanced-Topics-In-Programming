import java.util.Scanner;

/*(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.*/

/**
 * @author Aakash Sharan
 *
 */
public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		System.out.println("Please enter a binary number to convert:");
		Scanner sc = new Scanner(System.in);
		String binaryNumber = sc.next();

		int decimalNumber = binaryToDecimal(binaryNumber);
		System.out.println("The decimal number of " + binaryNumber + " is: " + decimalNumber);
	}

	/** Converts a binary number to decimal number.
	 * @param bNumber -  a binary number.
	 * @return int -  a decimal number.
	 * @throws NumberFormatException - if the number is not binary.
	 */
	public static int binaryToDecimal(String bNumber) {
		int decimalNumber = 0;
		try {
			// check if the number is binary or not.
			if (!bNumber.matches("[01]+")) {
				throw new NumberFormatException();
			}
			int number = Integer.parseInt(bNumber);
			int power = 0;
			while (number != 0) {
				int lastDigit = number % 10;
				decimalNumber += lastDigit * Math.pow(2, power);
				number = number / 10;
				power++;
			}

		} catch (NumberFormatException ex) {
			System.out.println("Please enter a valid binary number");
			System.exit(3);
		}
		return decimalNumber;
	}
}
