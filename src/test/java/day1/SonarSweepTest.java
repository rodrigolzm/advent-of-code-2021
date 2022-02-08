package day1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class SonarSweepTest {

	@Test
	public void test1() {
		var input = new Integer[] { 199, 200, 208, 210, 200, 207, 240, 269, 260, 263 };
		assertEquals(7, SonarSweep.partOne(input));
	}

	@Test
	public void test2() {
		var input = LoadInput.loadToInteger("day1/input.txt");
		assertEquals(1390, SonarSweep.partOne(input.toArray(new Integer[input.size()])));
	}

	@Test
	public void test3() {
		var input = new Integer[] { 199, 200, 208, 210, 200, 207, 240, 269, 260, 263 };
		assertEquals(5, SonarSweep.partTwo(input));
	}

	@Test
	public void test4() {
		var input = LoadInput.loadToInteger("day1/input.txt");
		assertEquals(1457, SonarSweep.partTwo(input.toArray(new Integer[input.size()])));
	}
}
