import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		/*
		creates a file object from the path provided in args
		counts elements in the file and creates an array of length = count
		reads elements from the file into the array
		reverse array (in place?)
		how can I contain all the FileNotFoundException occurences in one try block in the main method
		maybe with throws?
		*/
		// try {
		// 	File inputFile = new File(args[0]);
		// 	int len = elementCount(inputFile);
		// 	System.out.println(len);
		// } catch (FileNotFoundException e) {
		// 	System.out.println("wrong file dawg");
		// 	System.exit(0);
		// }
		if (args.length < 2) {
			System.out.println("Not enough arguments");
			System.exit(0);
		}
		File inputFile = new File(args[0]);
		int[] forReversal = readIntoArray(inputFile);
		// System.out.println(Arrays.toString(forReversal));
		reverseArray(forReversal);
		// System.out.println(Arrays.toString(forReversal));
		File outputFile = new File(args[1]);
		writeArray(outputFile, forReversal);
		System.out.println();


	}

	public static int elementCount(File f) {
		// use hasNext() to count elements
		int count = 0;
		try {
			Scanner scan = new Scanner(f);
			while (scan.hasNext()) {
				count++;
				scan.next();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("wrong file dawg");
			System.exit(0);
		}
		
		return count + 1;
	}
	
	public static void reverseArray(int[] arr) {
		int halfLen = (arr.length / 2);
		for (int i = 0; i < halfLen; i++) {
			// create a temp int to hold the value at index i
			int temp = arr[i];
			// ith value reassigned the value of its opposite position in array
			arr[i] = arr[arr.length - 1 - i];
			// finish the swap by replacing opposite side index with the original ith value
			// which is currently stored in temp
			arr[arr.length - 1 - i] = temp;
		}
	}
	public static int[] readIntoArray(File f) {
		try {
			Scanner scan = new Scanner(f);
		

			String[] numbersString = scan.nextLine().split("\\s+");	
			int[] numbers = new int[numbersString.length];

			scan.close();

			for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }

			return numbers;
		} catch (FileNotFoundException e) {
			System.out.println("wrong file dawg");
			int[] empty = new int[0];
			return empty;
		}
		
	}

	public static void writeArray(File f, int[] arr) {
		try {
			FileWriter writer = new FileWriter(f);
			// System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length; i++) {
				// System.out.println("writing: " + Integer.toString(n));
				if (i == (arr.length - 1)) {
					writer.write(Integer.toString(arr[i]));
				} else {
					writer.write(Integer.toString(arr[i]) + " ");
				}
			}
			writer.write("\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("wrong file dawg");
			System.exit(0);
		}
		
	}
}
