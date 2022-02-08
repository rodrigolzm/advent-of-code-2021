package day1;

public class SonarSweep {

	public static long partOne(Integer[] input) {
		var counter = 0l;
		
		for (int i = 1; i < input.length; i++) {
			if (input[i - 1] < input[i])
				counter++;
		}
		
		return counter;
	}
	
	public static long partTwo(Integer[] input) {
		var counter = 0l;
		
		var previous = Long.MAX_VALUE;
		
		for (int i = 0; i < input.length - 2; i++) {
			var sum = input[i] + input[i + 1] + input[i + 2];
			if (previous < sum)
				counter++;
			previous = sum;
		}
		
		return counter;
	}
}
