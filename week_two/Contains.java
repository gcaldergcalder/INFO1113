public class Contains {
	
	public static boolean contains(int[] a, int element) {
		if (a == null) {
			return false;
		}
		
		for (int num : a) {
			if (num == element) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		int[] array = {1, 1, 5, 5, 5, 3, 8, 1};
		boolean result = contains(array, 5);
		
	}
	
	
}