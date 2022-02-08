package day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class DiveTest {

	@Test
	public void test1() {
		var input = new String[] { "forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2" };
		assertEquals(150, Dive.partOne(input));
	}

	@Test
	public void test2() {
		var input = LoadInput.loadToString("day2/input.txt");
		assertEquals(2091984, Dive.partOne(input.toArray(new String[input.size()])));
	}

	@Test
	public void test3() {
		var input = new String[] { "forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2" };
		assertEquals(900, Dive.partTwo(input));
	}

	@Test
	public void test4() {
		var input = LoadInput.loadToString("day2/input.txt");
		assertEquals(2086261056, Dive.partTwo(input.toArray(new String[input.size()])));
	}
}
