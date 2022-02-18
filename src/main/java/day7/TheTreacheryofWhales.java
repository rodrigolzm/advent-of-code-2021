package day7;

import java.util.Arrays;

public class TheTreacheryofWhales {

	public static long partOne(int[] input) {
		
		Arrays.sort(input);
		
		var median = 0;
		
		if (input.length % 2 == 0)
			median = (input[input.length / 2 - 1] + input[input.length / 2]) / 2;
		else
			median = input[input.length / 2] / 2;
		
		var fuel = 0;
		
		for (int i = 0; i < input.length; i++) {
			fuel += Math.abs(median - input[i]);
		}
		
		return fuel;
	}
	
	public static long partTwo(int[] input) {
		
		var max = Arrays.stream(input).max().orElse(0);
		
		var minFuel = Long.MAX_VALUE;
		
		for (int i = 0; i <= max; i++) {
			var fuel = 0l;
			for (int j = 0; j < input.length; j++) {
				fuel += calculateFuel(Math.abs(i - input[j]));
			}
			if (minFuel > fuel)
				minFuel = fuel;
		}

		return minFuel;
	}
	
	private static long calculateFuel(long n) {
		if (n <= 1)
			return n;
		return n + calculateFuel(n -1);
	}

}
