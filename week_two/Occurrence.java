import java.util.Scanner;
import java.util.HashMap;

public class Occurrence {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			map.put(Integer.toString(i), 0);
		}
		String word = scan.nextLine();
        scan.close();
		char[] chars = word.toCharArray();
		// System.out.println(word);
		for (char c : chars) {
			int intChar = (int) c - 48;
			// System.out.print(intChar);
			if (map.containsKey(String.valueOf(intChar))) {
				map.put(String.valueOf(intChar), map.get(String.valueOf(c)) + 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
	
}