public class Count {
	
	public static int count(int[] array, int element) {
		int count = 0;
		
		if (array == null) {
			return 0;
		} else {
			for (int n : array) {
				if (n == element) {count++;}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		
	}
	
}