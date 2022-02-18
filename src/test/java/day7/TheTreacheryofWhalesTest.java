package day7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class TheTreacheryofWhalesTest {

	@Test
	public void test1() {
		var input = new int[] { 16, 1, 2, 0, 4, 2, 7, 1, 2, 14 };
		assertEquals(37, TheTreacheryofWhales.partOne(input));
	}

	@Test
	public void test2() {
		var input = LoadInput.loadFromStrings("day7/input.txt");
		assertEquals(340052, TheTreacheryofWhales.partOne(input));
	}

	@Test
	public void test3() {
		var input = new int[] { 16, 1, 2, 0, 4, 2, 7, 1, 2, 14 };
		assertEquals(168, TheTreacheryofWhales.partTwo(input));
	}

	@Test
	public void test4() {
		var input = LoadInput.loadFromStrings("day7/input.txt");
		assertEquals(92948968, TheTreacheryofWhales.partTwo(input));
	}
}
