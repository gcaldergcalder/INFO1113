import java.util.*;

public class SudokuSolve {
	
	public static boolean isSolvable(Integer[][] board) {
		HashMap<Integer, Set<Integer>> rows = new HashMap<>();
		HashMap<Integer, Set<Integer>> cols = new HashMap<>();
		Map<AbstractMap.SimpleEntry<Integer,Integer>, Set<Integer>> squares = new HashMap<>();
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				// boards dont come pre-solved lol, skip over null values to only compare attempted elements
				if (board[r][c] == null) {
					continue;
				}
				// no default dicts in java :( if there is no entry for a row, col, or suquare, we need to make one first.
				if (!rows.containsKey(r)) {
					rows.put(r, new HashSet<Integer>());
				}
				if (!cols.containsKey(c)) {
					cols.put(c, new HashSet<Integer>());
				}
				// Create a new SimpleEntry object that acts as an ordered pair representing the square an element is in
				AbstractMap.SimpleEntry<Integer, Integer> square = new AbstractMap.SimpleEntry<>(r/3, c/3);
				if (!squares.containsKey(square)) {
					squares.put(square, new HashSet<Integer>());
				}
				// if any of the sets for this row/column/square already have the item in their set, the sudoku is invalid
				if ((rows.get(r).contains(board[r][c]))
					|| (cols.get(c).contains(board[r][c]))
					|| (squares.get(square).contains(board[r][c]))) {
					return false;
				}
				// add the element to the sets for this row/column/square so that they can be compared in future iterations
				else {
					rows.get(r).add(board[r][c]);
					cols.get(c).add(board[r][c]);
					squares.get(square).add(board[r][c]);
				}
			}
		}
		// loop is exited when all elements have been checked
		// therefore should be true
		return true;
	}
	
	public static void main(String[] args) {
		//Write some tests if you want check here or change b
		Integer[][] b = { 
				{ 1, 2, 3},
				{ null, null, null},
				{ null, null, null}
			};
		if(isSolvable(b)) {
			System.out.println("Yes this is solvable!");
		}
	}
	
}


/*

create <int, hashSet> maps for rows, cols, and squares
iterate over rows and cols
if empty, continue
otherwise check if in the appropriate hashSet
if in hashset -> return false
else -> add to hashset
if the whole sudoku puzzle is traversed -> return true


*/