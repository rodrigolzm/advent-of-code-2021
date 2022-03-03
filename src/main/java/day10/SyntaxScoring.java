package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SyntaxScoring {

	public static long partOne(String[] lines) {

		var result = 0l;

		for (String line : lines) {

			var stack = new Stack<Character>();
			var chars = line.toCharArray();

			var score = 0;

			for (var i = 0; i < chars.length; i++) {

				if ('(' == chars[i])
					stack.push(')');

				else if ('[' == chars[i])
					stack.push(']');

				else if ('{' == chars[i])
					stack.push('}');

				else if ('<' == chars[i])
					stack.push('>');

				else if (stack.peek().equals(chars[i])) {
					stack.pop();
				} else {
					if (')' == chars[i])
						score = 3;
					else if (']' == chars[i])
						score = 57;
					else if ('}' == chars[i])
						score = 1197;
					else if ('>' == chars[i])
						score = 25137;
					break;
				}
			}

			result += score;
		}

		return result;
	}

	public static long partTwo(String[] lines) {

		var scores = new ArrayList<Long>();

		for (String line : lines) {

			var stack = new Stack<Character>();
			var chars = line.toCharArray();

			var isValid = true;

			for (var i = 0; i < chars.length; i++) {

				if ('(' == chars[i])
					stack.push(')');

				else if ('[' == chars[i])
					stack.push(']');

				else if ('{' == chars[i])
					stack.push('}');

				else if ('<' == chars[i])
					stack.push('>');

				else if (stack.peek().equals(chars[i])) {
					stack.pop();
				} else {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				var score = 0l;
				while (!stack.isEmpty()) {
					score *= 5;
					var chararcter = stack.pop();
					if (chararcter.equals(')'))
						score += 1;
					else if (chararcter.equals(']'))
						score += 2;
					else if (chararcter.equals('}'))
						score += 3;
					else if (chararcter.equals('>'))
						score += 4;
				}
				scores.add(score);
			}
		}

		var result = scores.toArray(new Long[scores.size()]);
		Arrays.sort(result);
		
		return result[result.length / 2];
	}

}