import java.util.Scanner;

public class Game {
	Board board;
	Scanner scan;
	Player player1, player2;

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}

	public void start() {
		int row = 0, col = 0;
		boolean win = false;

		scan = new Scanner(System.in);
		Board board = new Board();
		player1 = new Player("Player 1", "X");
		player2 = new Player("Player 2", "O");

		while (!win) {

			System.out.println(player1.toString() + "'s turn.");
			System.out.print("Please select row: ");
			row = Integer.parseInt(scan.nextLine());
			System.out.print("Please select col: ");
			col = Integer.parseInt(scan.nextLine());
			player1.placeSymbol(board, row, col);
			board.printBoard();
			System.out.println();
			if (board.checkWin(player1, board)) {
				System.out.println(player1 + " win!!");
				win = true;
				break;
			}

			System.out.println(player2.toString() + "'s turn.");
			System.out.print("Please select row: ");
			row = Integer.parseInt(scan.nextLine());
			System.out.print("Please select col: ");
			col = Integer.parseInt(scan.nextLine());
			player2.placeSymbol(board, row, col);
			board.printBoard();
			System.out.println();
			if (board.checkWin(player2, board)) {
				System.out.println(player2 + " win!!");
				win = true;
				break;
			}
		}

	}

}
