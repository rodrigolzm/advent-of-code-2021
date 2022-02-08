package day2;

public class Dive {

	public static long partOne(String[] input) {
		var horizontal = 0l;
		var depth = 0l;

		for (int i = 0; i < input.length; i++) {
			var parts = input[i].split(" ");

			if ("forward".equals(parts[0]))
				horizontal += Long.parseLong(parts[1]);
			else if ("down".equals(parts[0]))
				depth += Long.parseLong(parts[1]);
			else if ("up".equals(parts[0]))
				depth -= Long.parseLong(parts[1]);
		}

		return horizontal * depth;
	}

	public static long partTwo(String[] input) {
		var horizontal = 0l;
		var depth = 0l;
		var aim = 0l;

		for (int i = 0; i < input.length; i++) {
			var parts = input[i].split(" ");

			if ("forward".equals(parts[0])) {
				horizontal += Long.parseLong(parts[1]);
				depth += aim * Long.parseLong(parts[1]);
				
			} else if ("down".equals(parts[0])) {
				aim += Long.parseLong(parts[1]);
			
			} else if ("up".equals(parts[0])) {
				aim -= Long.parseLong(parts[1]);
			}
		}

		return horizontal * depth;
	}

}
