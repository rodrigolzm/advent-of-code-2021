package day3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class BinaryDiagnosticTest {

	@Test
	public void test1() {
		var input = new String[] { "00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000",
				"11001", "00010", "01010" };
		assertEquals(198, BinaryDiagnostic.partOne(input));
	}

	@Test
	public void test2() {
		var input = LoadInput.loadToString("day3/input.txt");
		assertEquals(2261546, BinaryDiagnostic.partOne(input.toArray(new String[input.size()])));
	}

	@Test
	public void test3() {
		var input = new String[] { "00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000",
				"11001", "00010", "01010" };
		assertEquals(230, BinaryDiagnostic.partTwo(input));
	}

	@Test
	public void test4() {
		var input = LoadInput.loadToString("day3/input.txt");
		assertEquals(6775520, BinaryDiagnostic.partTwo(input.toArray(new String[input.size()])));
	}
}
