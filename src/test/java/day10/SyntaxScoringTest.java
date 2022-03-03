package day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.LoadInput;

public class SyntaxScoringTest {

	@Test
	public void test1() {
		var input = new String[] { "[({(<(())[]>[[{[]{<()<>>",
				"[(()[<>])]({[<{<<[]>>(",
				"{([(<{}[<>[]}>{[]{[(<()>",
				"(((({<>}<{<{<>}{[]{[]{}",
				"[[<[([]))<([[{}[[()]]]",
				"[{[{({}]{}}([{[{{{}}([]",
				"{<[[]]>}<{[{[{[]{()[[[]",
				"[<(<(<(<{}))><([]([]()",
				"<{([([[(<>()){}]>(<<{{",
				"<{([{{}}[<[[[<>{}]]]>[]]"};
		assertEquals(26397, SyntaxScoring.partOne(input));
	}

	@Test
	public void test2() {
		var input = LoadInput.loadToString("day10/input.txt");
		assertEquals(464991, SyntaxScoring.partOne(input.toArray(new String[input.size()])));
	}

	@Test
	public void test3() {
		var input = new String[] { "[({(<(())[]>[[{[]{<()<>>",
				"[(()[<>])]({[<{<<[]>>(",
				"{([(<{}[<>[]}>{[]{[(<()>",
				"(((({<>}<{<{<>}{[]{[]{}",
				"[[<[([]))<([[{}[[()]]]",
				"[{[{({}]{}}([{[{{{}}([]",
				"{<[[]]>}<{[{[{[]{()[[[]",
				"[<(<(<(<{}))><([]([]()",
				"<{([([[(<>()){}]>(<<{{",
				"<{([{{}}[<[[[<>{}]]]>[]]"};
		assertEquals(288957, SyntaxScoring.partTwo(input));
	}

	@Test
	public void test4() {
		var input = LoadInput.loadToString("day10/input.txt");
		assertEquals(3662008566l, SyntaxScoring.partTwo(input.toArray(new String[input.size()])));
	}
}
