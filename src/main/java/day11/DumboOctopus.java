package day11;

import java.util.HashSet;
import java.util.Set;

public class DumboOctopus {

	public static long partOne(int[][] input) {

		var count = 0l;
		for (int d = 0; d < 100; d++) {
			var flashes = new HashSet<String>();
			
			for (int i = 0; i < input.length; i++)
				for (int j = 0; j < input.length; j++)
					applyStep(input, i, j, flashes);

			count += flashes.size();
		}

		return count;
	}

	private static void applyStep(int[][] input, int i, int j, Set<String> flashes) {
		if (i < 0 || j < 0 || i > 9 || j > 9 || flashes.contains(i + "," + j))
			return;

		input[i][j]++;

		if (input[i][j] > 9)
			input[i][j] = 0;

		if (input[i][j] == 0) {

			flashes.add(i + "," + j);
			
			applyStep(input, i - 1, j, flashes);
			applyStep(input, i, j + 1, flashes);
			applyStep(input, i + 1, j, flashes);
			applyStep(input, i, j - 1, flashes);

			applyStep(input, i - 1, j - 1, flashes);
			applyStep(input, i - 1, j + 1, flashes);
			applyStep(input, i + 1, j - 1, flashes);
			applyStep(input, i + 1, j + 1, flashes);
		}
	}

	public static long partTwo(int[][] input) {

		var step = 0;
		
		while(true) {
			step++;
			
			var flashes = new HashSet<String>();
			
			for (int i = 0; i < input.length; i++)
				for (int j = 0; j < input.length; j++)
					applyStep(input, i, j, flashes);
			
			boolean allFlashed = true;
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input.length; j++) {
					
					if (input[j][i] != 0) allFlashed = false;
					if (!allFlashed) break;
				}

				if (!allFlashed) break;
			}
			
			if (allFlashed)
				break;
		}

		return step;
	}

}