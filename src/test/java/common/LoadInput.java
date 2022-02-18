package common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LoadInput {

	public static List<Integer> loadToInteger(String path) {
		var input = new ArrayList<Integer>();

		var resource = LoadInput.class.getClassLoader().getResource(path);
		try (var scanner = new Scanner(new File(resource.toURI()))) {
			while (scanner.hasNextLine())
				input.add(Integer.valueOf(scanner.nextLine()));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return input;
	}

	public static List<String> loadToString(String path) {
		var input = new ArrayList<String>();

		var resource = LoadInput.class.getClassLoader().getResource(path);
		try (var scanner = new Scanner(new File(resource.toURI()))) {
			while (scanner.hasNextLine())
				input.add(scanner.nextLine());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return input;
	}
	
	public static int[] loadFromStrings(String path) {
		var array = new ArrayList<Integer>();
		
		var resource = LoadInput.class.getClassLoader().getResource(path);
		try (var scanner = new Scanner(new File(resource.toURI()))) {
			var lines = new ArrayList<String>();
			while (scanner.hasNextLine())
				lines.add(scanner.nextLine());
			lines.forEach(line -> {
				var numbers = line.split(",");
				for (var number : numbers) {
					array.add(Integer.valueOf(number));
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
		var inputs = new int[array.size()];
		
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = array.get(i);
		}
		
		return inputs;
	}

	public static Object[] loadToGiantSquidPuzzle(String path) {

		Integer[] input = null;

		var boards = new ArrayList<Integer[][]>();
		Integer[][] board = null;

		var rowIndex = 0;

		var lines = loadToString(path);
		for (String line : lines) {

			if (line.contains(",")) {
				input = Stream.of(line.split(",")).mapToInt(Integer::valueOf).boxed().toArray(Integer[]::new);
			} else if (line.isEmpty()) {
				if (board != null)
					boards.add(board);

				rowIndex = 0;
				board = new Integer[5][5];
			} else {
				board[rowIndex] = Stream.of(line.split(" ")).filter(s -> !s.isEmpty()).mapToInt(Integer::valueOf).boxed().toArray(Integer[]::new);
				rowIndex++;
			}
		}
		
		boards.add(board);

		return new Object[] { input, boards };
	}

}
