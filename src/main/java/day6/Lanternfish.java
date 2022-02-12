package day6;

public class Lanternfish {

	public static long partOne(int[] input, int days) {

		var previous = new long[9];
		var current = new long[9];

		for (var i = 0; i < input.length; i++) {
			previous[(int) input[i]]++;
		}

		for (var day = 1; day <= days; day++) {
			current = new long[9];
			for (var i = 8; i >= 0; i--) {
				if (i == 0) {
					current[6] += previous[i];
					current[8] += previous[i];
				} else {
					current[i - 1] = previous[i];
				}
			}
			previous = current;
		}

		var count = 0;

		for (var i = 0; i < current.length; i++) {
			count += current[i];
		}

		return count;
	}

}
