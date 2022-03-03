package day11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class DumboOctopusTest {

	@Test
	public void test1() {
		var input = new int[10][10];
		var lines = new String[] { "5483143223", "2745854711", "5264556173", "6141336146", "6357385478", "4167524645",
				"2176841721", "6882881134", "4846848554", "5283751526" };

		for (int i = 0; i < lines.length; i++) {
			var chars = lines[i].toCharArray();
			for (int j = 0; j < chars.length; j++)
				input[i][j] = Integer.valueOf(new String(new char[] { chars[j] }));
		}
		
		assertEquals(1656, DumboOctopus.partOne(input));
	}

	@Test
	public void test2() {
		var input = new int[10][10];
		var lines = LoadInput.loadToString("day11/input.txt");
		for (int i = 0; i < lines.size(); i++) {
			var chars = lines.get(i).toCharArray();
			for (int j = 0; j < chars.length; j++)
				input[i][j] = Integer.valueOf(new String(new char[] { chars[j] }));
		}
		assertEquals(1599, DumboOctopus.partOne(input));
	}

	@Test
	public void test3() {
		var input = new int[10][10];
		var lines = new String[] { "5483143223", "2745854711", "5264556173", "6141336146", "6357385478", "4167524645",
				"2176841721", "6882881134", "4846848554", "5283751526" };

		for (int i = 0; i < lines.length; i++) {
			var chars = lines[i].toCharArray();
			for (int j = 0; j < chars.length; j++)
				input[i][j] = Integer.valueOf(new String(new char[] { chars[j] }));
		}
		assertEquals(195, DumboOctopus.partTwo(input));
	}

	@Test
	public void test4() {
		var input = new int[10][10];
		var lines = LoadInput.loadToString("day11/input.txt");
		for (int i = 0; i < lines.size(); i++) {
			var chars = lines.get(i).toCharArray();
			for (int j = 0; j < chars.length; j++)
				input[i][j] = Integer.valueOf(new String(new char[] { chars[j] }));
		}
		assertEquals(418, DumboOctopus.partTwo(input));
	}
}
