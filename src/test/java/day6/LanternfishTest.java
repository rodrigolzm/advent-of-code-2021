package day6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class LanternfishTest {

	@Test
	public void test1() {
		var days = 80;
		var input = new int[] { 3, 4, 3, 1, 2 };
		assertEquals(5934, Lanternfish.partOne(input, days));
	}

	@Test
	public void test2() {
		var days = 80;
		var input = LoadInput.loadFromStrings("day6/input.txt");
		assertEquals(396210, Lanternfish.partOne(input, days));
	}

	@Test
	public void test3() {
		var days = 256;
		var input = new int[] { 3, 4, 3, 1, 2 };
		assertEquals(26984457539l, Lanternfish.partTwo(input, days));
	}

	@Test
	public void test4() {
		var days = 256;
		var input = LoadInput.loadFromStrings("day6/input.txt");
		assertEquals(1770823541496l, Lanternfish.partTwo(input, days));
	}
}
