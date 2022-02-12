package day5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class HydrothermalVentureTest {

	@Test
	public void test1() {
		var input = new int[][] { { 0, 9, 5, 9 }, { 8, 0, 0, 8 }, { 9, 4, 3, 4 }, { 2, 2, 2, 1 }, { 7, 0, 7, 4 },
				{ 6, 4, 2, 0 }, { 0, 9, 2, 9 }, { 3, 4, 1, 4 }, { 0, 0, 8, 8 }, { 5, 5, 8, 2 } };
		assertEquals(5, HydrothermalVenture.partOne(input));
	}

	@Test
	public void test2() {
		var lines = LoadInput.loadToString("day5/input.txt");

		var input = new int[lines.size()][4];

		for (int i = 0; i < lines.size(); i++) {
			var parts = lines.get(i).split(" -> ");
			var a = parts[0].split(",");
			var b = parts[1].split(",");
			input[i] = new int[] { Integer.valueOf(a[0]), Integer.valueOf(a[1]), Integer.valueOf(b[0]),
					Integer.valueOf(b[1]) };
		}
		
		assertEquals(5167, HydrothermalVenture.partOne(input));
	}
	
	@Test
	public void test3() {
		var input = new int[][] { { 0, 9, 5, 9 }, { 8, 0, 0, 8 }, { 9, 4, 3, 4 }, { 2, 2, 2, 1 }, { 7, 0, 7, 4 },
				{ 6, 4, 2, 0 }, { 0, 9, 2, 9 }, { 3, 4, 1, 4 }, { 0, 0, 8, 8 }, { 5, 5, 8, 2 } };
		assertEquals(12, HydrothermalVenture.partTwo(input));
	}

	@Test
	public void test4() {
		var lines = LoadInput.loadToString("day5/input.txt");

		var input = new int[lines.size()][4];

		for (int i = 0; i < lines.size(); i++) {
			var parts = lines.get(i).split(" -> ");
			var a = parts[0].split(",");
			var b = parts[1].split(",");
			input[i] = new int[] { Integer.valueOf(a[0]), Integer.valueOf(a[1]), Integer.valueOf(b[0]),
					Integer.valueOf(b[1]) };
		}
		
		assertEquals(17604, HydrothermalVenture.partTwo(input));
	}

}
