package day6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
		var lines = LoadInput.loadToString("day6/input.txt");

		var inputs = new ArrayList<Integer>();

		lines.forEach(line -> {
			var numbers = line.split(",");
			for (var number : numbers) {
				inputs.add(Integer.valueOf(number));
			}
		});

		var input = new int[inputs.size()];
		for (var i = 0; i < inputs.size(); i++)
			input[i] = inputs.get(i);

		assertEquals(396210, Lanternfish.partOne(input, days));
	}

}
