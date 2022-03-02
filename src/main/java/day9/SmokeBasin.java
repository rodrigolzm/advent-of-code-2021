package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmokeBasin {

	public static long partOne(int[][] input) {

		var lowest = new ArrayList<Integer>();

		for (int y = 0; y < input.length; y++)
			for (int x = 0; x < input[y].length; x++)
				
				if (checkLowestUp(input, y, x) && checkLowestRight(input, y, x) && checkLowestDown(input, y, x)
						&& checkLowestLeft(input, y, x))
					lowest.add(input[y][x]);
		
		var risk = 0l;
		
		for (Integer i : lowest)
			risk += i + 1;

		return risk;
	}

	private static boolean checkLowestUp(int[][] input, int y, int x) {
		if (y == 0)
			return true;
		return input[y][x] < input[y - 1][x];
	}

	private static boolean checkLowestDown(int[][] input, int y, int x) {
		if (y == input.length - 1)
			return true;
		return input[y][x] < input[y + 1][x];
	}

	private static boolean checkLowestLeft(int[][] input, int y, int x) {
		if (x == 0)
			return true;
		return input[y][x] < input[y][x - 1];
	}

	private static boolean checkLowestRight(int[][] input, int y, int x) {
		if (x == input[y].length - 1)
			return true;
		return input[y][x] < input[y][x + 1];
	}

	public static long partTwo(int[][] input) {
		
		var lowest = new ArrayList<String>();

		for (int y = 0; y < input.length; y++)
			for (int x = 0; x < input[y].length; x++)
				
				if (checkLowestUp(input, y, x) && checkLowestRight(input, y, x) && checkLowestDown(input, y, x)
						&& checkLowestLeft(input, y, x))
					lowest.add(y + "," + x);
		
		var result = new int[lowest.size()];
		
		for (int i = 0; i < lowest.size(); i++) {
			var nums = lowest.get(i).split(",");
			result[i] = count(input, Integer.valueOf(nums[0]), Integer.valueOf(nums[1]), new HashSet<String>());
		}
		
		Arrays.sort(result);
		
		return result[result.length - 1] * result[result.length - 2] * result[result.length - 3];
	}
	
	private static int count(int[][] input, int r, int c, Set<String> visited) {
		
		if (visited.contains(r + "," + c))
			return 0;
		
		if (r < 0 || r >= input.length || c < 0 || c >= input[r].length || input[r][c] == 9)
			return 0;
		
		visited.add(r + "," + c);
		
		var up = count(input, r - 1, c, visited);
		var right = count(input, r, c + 1, visited);
		var down = count(input, r + 1, c, visited);
		var left = count(input, r, c - 1, visited);
		
		return up + right + down + left + 1;
	}

}