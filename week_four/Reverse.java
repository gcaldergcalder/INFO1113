import java.util.Scanner;
import java.util.ArrayList;



public class Reverse {

	public static void main(String[] args) {

		ArrayList<String> inputs = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			inputs.add(scan.nextLine());
		}

		for (String s : inputs) {
            // cannot call generic methods on primitive types so we create a Character[] array instead
            Character[] CharacterArray = toCharacterArray(s);
            // reverse array in place using generic array_reverse method
            array_reverse(CharacterArray);

            // cannot construct a tring
			StringBuilder sb = new StringBuilder(CharacterArray.length);
            for (Character c : CharacterArray) {
                sb.append(c);
            }
            String reversedString = sb.toString();
			System.out.println(reversedString);
		}

		scan.close();
	}

	public static <T> void array_reverse(T[] arr) {
		// uses generic typing to support different array types
		// sorts an array in place
		int halfLen = (arr.length / 2);
		for (int i = 0; i < halfLen; i++) {
			T temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

	}

    public static Character[] toCharacterArray(String s) {
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
}