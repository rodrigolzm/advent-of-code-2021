package day4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import common.LoadInput;

public class GiantSquidTest {

	@Test
	public void test1() {
		var input = new Integer[] { 7, 4, 9, 5, 11, 17, 23, 2, 0, 14, 21, 24, 10, 16, 13, 6, 15, 25, 12, 22, 18,
				20, 8, 19, 3, 26, 1 };
		var board1 = new Integer[][] { { 22, 13, 17, 11, 0 }, { 8, 2, 23, 4, 24 }, { 21, 9, 14, 16, 7 },
				{ 6, 10, 3, 18, 5 }, { 1, 12, 20, 15, 19 } };
		var board2 = new Integer[][] { { 3, 15, 0, 2, 22 }, { 9, 18, 13, 17, 5 }, { 19, 8, 7, 25, 23 },
				{ 20, 11, 10, 24, 4 }, { 14, 21, 16, 12, 6 } };
		var board3 = new Integer[][] { { 14, 21, 17, 24, 4 }, { 10, 16, 15, 9, 19 }, { 18, 8, 23, 26, 20 },
				{ 22, 11, 13, 6, 5 }, { 2, 0, 12, 3, 7 } };
		assertEquals(4512, GiantSquid.partOne(Arrays.asList(input), Arrays.asList(board1, board2, board3)));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test2() {
		var args = LoadInput.loadToGiantSquidPuzzle("day4/input.txt");
		assertEquals(45031, GiantSquid.partOne(Arrays.asList((Integer[]) args[0]), (List<Integer[][]>) args[1]));
	}
	
	@Test
	public void test3() {
		var input = new Integer[] { 7, 4, 9, 5, 11, 17, 23, 2, 0, 14, 21, 24, 10, 16, 13, 6, 15, 25, 12, 22, 18,
				20, 8, 19, 3, 26, 1 };
		var board1 = new Integer[][] { { 22, 13, 17, 11, 0 }, { 8, 2, 23, 4, 24 }, { 21, 9, 14, 16, 7 },
				{ 6, 10, 3, 18, 5 }, { 1, 12, 20, 15, 19 } };
		var board2 = new Integer[][] { { 3, 15, 0, 2, 22 }, { 9, 18, 13, 17, 5 }, { 19, 8, 7, 25, 23 },
				{ 20, 11, 10, 24, 4 }, { 14, 21, 16, 12, 6 } };
		var board3 = new Integer[][] { { 14, 21, 17, 24, 4 }, { 10, 16, 15, 9, 19 }, { 18, 8, 23, 26, 20 },
				{ 22, 11, 13, 6, 5 }, { 2, 0, 12, 3, 7 } };
		assertEquals(1924, GiantSquid.partTwo(Arrays.asList(input), Arrays.asList(board1, board2, board3)));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test4() {
		var args = LoadInput.loadToGiantSquidPuzzle("day4/input.txt");
		assertEquals(2568, GiantSquid.partTwo(Arrays.asList((Integer[]) args[0]), (List<Integer[][]>) args[1]));
	}

}
