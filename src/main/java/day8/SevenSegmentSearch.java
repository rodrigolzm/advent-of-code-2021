package day8;

import java.util.ArrayList;
import java.util.Arrays;

public class SevenSegmentSearch {

	public static long partOne(String[] input) {
		var count = 0;

		for (String s : input) {
			var parts = s.split(" \\| ")[1].split(" ");

			for (String p : parts) {
				switch (p.length()) {
				// 1
				case 2:
					// 4
				case 4:
					// 7
				case 3:
					// 8
				case 7:
					count++;
				}
			}
		}
		return count;
	}

	public static long partTwo(String[] input) {
		var sum = 0l;

		for (String line : input) {
			var first = line.split(" \\| ")[0].split(" ");
			var second = line.split(" \\| ")[1].split(" ");

			var map = buildMap(first);

			var num = "";

			for (String key : second) {
				var k = key.toCharArray();
				Arrays.sort(k);
						
				for (int i = 0; i < map.length; i++) {
					var m = map[i].toCharArray();
					Arrays.sort(m);
					if (new String(k).equals(new String(m))) {
						num += i;
						break;
					}
				}
			}

			sum += Long.valueOf(num);
		}
		return sum;
	}

	private static String[] buildMap(String[] input) {

		var array = new String[10];

		for (String str : input) {
			if (str.length() == 2)
				array[1] = str;

			else if (str.length() == 4)
				array[4] = str;

			else if (str.length() == 3)
				array[7] = str;

			else if (str.length() == 7)
				array[8] = str;
		}
		
		for (String str : input) {
			if (str.length() == 6) {
				if (!contains(str.toCharArray(), array[1].toCharArray())) {
					array[6] = str;	
				} else if (!contains(str.toCharArray(), array[4].toCharArray())) {
					array[0] = str;
				} else {
					array[9] = str;
				}
			}
		}
		
		for (String str : input) {
			if (str.length() == 5) {
				if (contains(array[6].toCharArray(), str.toCharArray())) {
					array[5] = str;	
				} else if (!contains(array[9].toCharArray(), str.toCharArray())) {
					array[2] = str;
				} else {
					array[3] = str;
				}
			}
		}
		
		return array;
	}
	
	private static boolean contains(char[] c1, char[] c2) {
		var l1 = new ArrayList<Character>();
		var l2 = new ArrayList<Character>();
		
		for (char c : c1) 
			l1.add(c);

		for (char c : c2) 
			l2.add(c);

		return l1.containsAll(l2);
	}

}