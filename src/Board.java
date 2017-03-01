
public class Board {
	static int size;
	static String[][] board;

	public Board() {
		size = 9;
		board = new String[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = "_";
			}
		}
	}

	public int getSize() {
		return size;
	}

	public String[][] getBoard() {
		return board;
	}

	public void placeSymBol(Symbol s, int row, int col) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == row - 1 && j == col - 1) {
					board[i][j] = s.value;
				}
			}
		}

	}
	
	public boolean checkA(int row, int column){
		if(board[row][column].equals("_")) return true;
		return false;
	}

	public void printBoard() {
		for (int i = 0; i <= size; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean checkWin(Player player, Board board) {
		System.out.println("Checking ....");
		if (checkRow(player)) {
			return true;
		} else if (checkColumn(player)) {
			return true;
		} else if (checkDiagonal(player)) {
			return true;
		}
		return false;
	}

	public boolean checkDiagonal(Player player) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; i + j < 9; j++) {
				if (board[i + j][j].equals(player.getSymValue())) {
					count++;
					if (count == 5) {
						return true;
					}
				} else
					count = 0;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; i + j < 9; j++) {
				if (board[j][i + j].equals(player.getSymValue())) {
					count++;
					if (count == 5) {
						return true;
					}
				} else
					count = 0;
			}
		}

		return false;
	}

	public boolean checkRow(Player player) {
		int count = 0;
		for (int i = 0; i < 9 ; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j].equals(player.getSymValue())) {
					count++;
					if (count == 5) {
						return true;
					}
				} else {
					count = 0;
				}
			}
		}

		return false;
	}

	public boolean checkColumn(Player player) {
		int count = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[j][i].equals(player.getSymValue())) {
					count++;
					if (count == 5) {
						return true;
					}
				} else {
					count = 0;
				}
			}
		}

		return false;
	}

}
