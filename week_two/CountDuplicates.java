import java.util.HashMap;

public class CountDuplicates {
	
	
	public static int countDuplicates(int[] a) {
		if (a == null) {
			return 0;
		}
		int dupeCount = 0;
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int e : a) {
			if (freqMap.containsKey(e)) {
				freqMap.put(e, freqMap.get(e) + 1);
			} else {
				freqMap.put(e, 0);
			}
		}
		for (int key : freqMap.keySet()) {
			if (freqMap.get(key) > 0){
				dupeCount += 1;
			}
		}
		return dupeCount;
	}
	
	public static void main(String[] args) {
		
		
	}
	
}