public class GameOfLife {
	public static void main(String[] args) {
		int rows = 10;
		int cols = 10;
		int[][] board = initializeBoard(rows, cols);
		printBoard(board);

		for (int generation = 1; generation <= 5; generation++) {
			System.out.println("Generation " + generation);
			board = simulateGeneration(board);
			printBoard(board);
		}
	}

	private static int[][] initializeBoard(int rows, int cols) {
		int[][] board = new int[rows][cols];
		// Initialize the board randomly or with some pattern as needed
		// For simplicity, let's initialize with some random live cells
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				board[i][j] = Math.random() < 0.5 ? 0 : 1;
			}
		}
		return board;
	}

	private static void printBoard(int[][] board) {
		for (int[] row : board) {
			for (int cell : row) {
				System.out.print(cell == 1 ? "■ " : "□ ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static int[][] simulateGeneration(int[][] board) {
		int rows = board.length;
		int cols = board[0].length;
		int[][] newBoard = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int liveNeighbors = countLiveNeighbors(board, i, j);

				if (board[i][j] == 1) {
					// Cell is currently alive
					newBoard[i][j] = (liveNeighbors == 2 || liveNeighbors == 3) ? 1 : 0;
				} else {
					// Cell is currently dead
					newBoard[i][j] = (liveNeighbors == 3) ? 1 : 0;
				}
			}
		}

		return newBoard;
	}

	private static int countLiveNeighbors(int[][] board, int row, int col) {
		int count = 0;
		int rows = board.length;
		int cols = board[0].length;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int neighborRow = row + i;
				int neighborCol = col + j;

				if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols) {
					count += board[neighborRow][neighborCol];
				}
			}
		}

		// Subtract the center cell since we added it in the loop
		count -= board[row][col];

		return count;
	}
}
