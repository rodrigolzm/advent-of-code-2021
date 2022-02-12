package day5;

public class HydrothermalVenture {

	public static long partOne(int[][] input) {

		var size = 0;

		for (var line : input)
			size = Math.max(size, Math.max(Math.max(line[0], line[1]), Math.max(line[2], line[3])));

		var map = new int[size + 1][size + 1];

		for (var line : input) {

			if (line[1] == line[3]) {
				for (var i = Math.min(line[0], line[2]); i <= Math.max(line[0], line[2]); i++) {
					map[line[1]][i]++;
				}
			}

			if (line[0] == line[2]) {
				for (var i = Math.min(line[1], line[3]); i <= Math.max(line[1], line[3]); i++) {
					map[i][line[0]]++;
				}
			}
		}

		var count = 0;

		for (var row : map)
			for (var point : row)
				count += point < 2 ? 0 : 1;

		return count;
	}

	public static long partTwo(int[][] input) {
		var size = 0;

		for (var line : input)
			size = Math.max(size, Math.max(Math.max(line[0], line[1]), Math.max(line[2], line[3])));

		var map = new int[size + 1][size + 1];

		for (var line : input) {
			
			if (line[1] == line[3]) {
				
				for (var i = Math.min(line[0], line[2]); i <= Math.max(line[0], line[2]); i++) {
					map[line[1]][i]++;
				}
				
			} else if (line[0] == line[2]) {
				
				for (var i = Math.min(line[1], line[3]); i <= Math.max(line[1], line[3]); i++) {
					map[i][line[0]]++;
				}

			} else {
				
				var steps = Math.max(line[1], line[3]) - Math.min(line[1], line[3]);
				
				for (var i = 0; i <= steps; i++) {
					var x = line[1] < line[3] ? line[1] + i : line[1] - i;
					var y = line[0] < line[2] ? line[0] + i : line[0] - i;					
					map[x][y]++;
				}
			}
		}
		
		var count = 0;

		for (var row : map)
			for (var point : row)
				count += point < 2 ? 0 : 1;

		return count;
	}

}
