public class ArrayMerge{
	public static int[][] mergeArrays(int[][] arrayA, int[][] arrayB){
		int mergedLength = arrayA[0].length + arrayB[0].length;
		int[][] merged = new int[arrayA.length][mergedLength];
		// loop through first dimension (rows) of arrayA
		for (int i = 0; i < arrayA.length; i++) {
			// loop through second dimension (cols) of arrayA for each row
			for (int j = 0; j < arrayA[0].length; j++) {
				merged[i][j] = arrayA[i][j];
			}
		}
		// loop through first dimension (rows) of arrayB
		for (int i = 0; i < arrayB.length; i++) {
			// cant use indexes of arrayB cols
			// start after last arrayA column added (start at arrayA[0].length)
			// loop to last col of merged array (< mergedLength)
			for (int j = 0; j < arrayB[0].length; j++) {
				// no change for row indicator
				merged[i][j + arrayA[0].length] = arrayB[i][j];
			}
		}
		return merged;
	}

	public static void main(String[] args) {

	}
}