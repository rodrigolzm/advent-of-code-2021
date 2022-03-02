package day9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class SmokeBasinTest {

	@Test
	public void test1() {
		var input = new int[][] { { 2, 1, 9, 9, 9, 4, 3, 2, 1, 0 }, { 3, 9, 8, 7, 8, 9, 4, 9, 2, 1 },
				{ 9, 8, 5, 6, 7, 8, 9, 8, 9, 2 }, { 8, 7, 6, 7, 8, 9, 6, 7, 8, 9 }, { 9, 8, 9, 9, 9, 6, 5, 6, 7, 8 } };
		assertEquals(15, SmokeBasin.partOne(input));
	}

	@Test
	public void test2() {
		var lines = LoadInput.loadToString("day9/input.txt");
		
		var input = new int[lines.size()][lines.size()];
		
		for (int y = 0; y < lines.size(); y++)
			for (int x = 0; x < lines.get(y).toCharArray().length; x++)
				input[y][x] = Integer.valueOf(String.valueOf(lines.get(y).toCharArray()[x]));
		
		assertEquals(506, SmokeBasin.partOne(input));
	}

	@Test
	public void test3() {
		var input = new int[][] { { 2, 1, 9, 9, 9, 4, 3, 2, 1, 0 }, { 3, 9, 8, 7, 8, 9, 4, 9, 2, 1 },
			{ 9, 8, 5, 6, 7, 8, 9, 8, 9, 2 }, { 8, 7, 6, 7, 8, 9, 6, 7, 8, 9 }, { 9, 8, 9, 9, 9, 6, 5, 6, 7, 8 } };
		assertEquals(1134, SmokeBasin.partTwo(input));
	}

	@Test
	public void test4() {
		var lines = LoadInput.loadToString("day9/input.txt");
		
		var input = new int[lines.size()][lines.size()];
		
		for (int y = 0; y < lines.size(); y++)
			for (int x = 0; x < lines.get(y).toCharArray().length; x++)
				input[y][x] = Integer.valueOf(String.valueOf(lines.get(y).toCharArray()[x]));
		assertEquals(931200, SmokeBasin.partTwo(input));
	}
}
