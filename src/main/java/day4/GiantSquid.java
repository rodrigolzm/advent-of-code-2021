package day4;

import java.util.List;

public class GiantSquid {

	public static long partOne(List<Integer> input, List<Integer[][]> boards) {

		Integer[][] winner = null;
		var smaller = input.size();

		for (var board : boards) {
			var index = checkBoard(input, board);
			if (index != -1 && index < smaller) {
				winner = board;
				smaller = index;
			}
		}		
		
		var score = calculateScore(input.subList(0, smaller + 1), winner);
		var latestNumber = input.get(smaller);
		
		return score * latestNumber;
	}
	

	public static long partTwo(List<Integer> input, List<Integer[][]> boards) {
		Integer[][] last = null;
		var lastDrawn = 0;

		for (var board : boards) {
			var index = checkBoard(input, board);
			if (index > lastDrawn) {
				last = board;
				lastDrawn = index;
			}
		}		
		
		var score = calculateScore(input.subList(0, lastDrawn + 1), last);
		var latestNumber = input.get(lastDrawn);
		
		return score * latestNumber;
	}
	
	private static int checkBoard(List<Integer> input, Integer[][] board) {
		var smaller = input.size();
		
		for (int i = 0; i < 5; i++) {
			
			var minRow = 0;
			var minCol = 0;
			
			for (int j = 0; j < 5; j++) {
				var index = input.indexOf(board[i][j]);
				if (minRow != -1)
					minRow = Math.max(minRow, index);
				
				index = input.indexOf(board[j][i]);
				if (minCol != -1)
					minCol = Math.max(minCol, index);
			}
			
			smaller = Math.min(smaller, Math.min(minRow, minCol));
		}

		return smaller;
	}

	private static int calculateScore(List<Integer> input, Integer[][] board) {
		if (board == null)
			return 0;
		
		var sum = 0;
		
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				var index = input.indexOf(board[r][c]);
				if (index < 0)
					sum += board[r][c];
			}
		}
		
		return sum;
	}

}
