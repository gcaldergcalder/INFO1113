import java.util.Scanner;

public class Binary {

	// Returns decimal representation of given binary number.
	public static int toDecimal(String b) {
		int decimal = 0;
		int i = 0;
		char[] chars = b.toCharArray();
		// you could probably iterate in reverse here instead with (arr.length - 1 - i) as the index
		// instead of using reverseArray
		// reversal is in-place though so only O(1) memory used for temp?
		reverseArray(chars);
		for (char c : chars) {
			// System.out.println(c + " times 2 to the power of " + i + " is equal to " + (Character.getNumericValue(c) * Math.pow(2, i)));
			decimal += (Character.getNumericValue(c) * Math.pow(2, i));
			i += 1;
		}
		return decimal;
	}

	// Returns whether or not given string is a binary number.
	public static boolean isBinary(String b) {
		for (char c : b.toCharArray()) {
			if (!(c == '0' || c == '1')) {
				return false;
			}
		}
		return true;
	}

	public static void reverseArray(char[] arr) {
		int halfLen = (arr.length / 2);
		for (int i = 0; i < halfLen; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {

		int decimal;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter binary: ");
		String binary = scan.nextLine();
		System.out.println();
		if (isBinary(binary)) {
			decimal = toDecimal(binary);
			System.out.println(decimal + " in decimal");
		} else {
			System.out.println("Not binary!");
		}
        scan.close();

	}
}