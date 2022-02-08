package day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryDiagnostic {

	public static long partOne(String[] input) {

		var frequency = new int[input[0].length()];

		for (String num : input) {
			var parts = num.toCharArray();
			for (int i = 0; i < parts.length; i++) {
				frequency[i] += Integer.parseInt(String.valueOf(parts[i]));
			}
		}

		var gamma = "";
		var epsilon = "";
		for (int num : frequency) {
			gamma += input.length / 2 < num ? "1" : "0";
			epsilon += input.length / 2 < num ? "0" : "1";
		}

		return Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2);
	}

	public static long partTwo(String[] input) {

		var oxygen = Arrays.asList(input);
		
		var index = 0;
		while (oxygen.size() > 1) {
			oxygen = filter(oxygen, index, true);
			index++;
		}

		var co2 = Arrays.asList(input);
		
		index = 0;
		while (co2.size() > 1) {
			co2 = filter(co2, index, false);
			index++;
		}
		
		return Integer.parseInt(oxygen.get(0), 2) * Integer.parseInt(co2.get(0), 2);
	}

	private static List<String> filter(List<String> input, int index, boolean mostCommon) {
		var frequency = 0;

		for (String num : input)
			frequency += Integer.parseInt(String.valueOf(num.toCharArray()[index]));
		
		var next =  "";
		if (mostCommon)
			next = input.size() / 2.0 <= frequency ? "1" : "0";
		else
			next = input.size() / 2.0 <= frequency ? "0" : "1";
		
		var init = input.get(0).substring(0, index) + next;

		return input.stream().filter(s -> s.startsWith(init)).collect(Collectors.toList());
	}

}
