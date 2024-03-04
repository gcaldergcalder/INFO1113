import java.util.HashSet;

public class ArrayUnion {
	
	public static int[] union(int[] a, int[] b) {
		if (a == null || b == null) {
			return null;
		}

		HashSet<Integer> set = new HashSet<>();

		for (int e : a) {
			set.add(e);
		}

		for (int e : b) {
			set.add(e);
		}

		int[] union = new int[set.size()];
		
		int i = 0;

		for (int e : set) {
			union[i++] = e;
		}

		return union;

	}
	
	
	public static void main(String[] args) {
		
		
	}
	
}