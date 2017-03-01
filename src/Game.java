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
		boolean win = false, placed = false;
		int turn = 0;
		scan = new Scanner(System.in);
		Board board = new Board();
		player1 = new Player("Player 1", "X");
		player2 = new Player("Player 2", "O");

		while (!win) {
			board.printBoard();
			while (!placed) {
				System.out.println(player1.toString() + "'s turn.");
				System.out.print("Please select row: ");
				row = Integer.parseInt(scan.nextLine());
				System.out.print("Please select col: ");
				col = Integer.parseInt(scan.nextLine());
				if(row < 0 || col < 0 || row > board.getSize() || col > board.getSize() || !board.checkA(row,col)){
					System.out.println("You can't place on this. Choose another row and column.\n");
				}else{
					player1.placeSymbol(board, row, col);
					placed = true;
					turn++;
				}
			}

			board.printBoard();
			placed = false;
			
			System.out.println();
			if (board.checkWin(player1)) {
				System.out.println(player1 + " win!!");
				win = true;
				break;
			}

			while (!placed) {
				System.out.println(player2.toString() + "'s turn.");
				System.out.print("Please select row: ");
				row = Integer.parseInt(scan.nextLine());
				System.out.print("Please select col: ");
				col = Integer.parseInt(scan.nextLine());
				if(row < 0 || col < 0 || row > board.getSize() || col > board.getSize() || !board.checkA(row,col)){
					System.out.println("You can't place on this. Choose another row and column.\n");
				}else{
					player2.placeSymbol(board, row, col);
					placed = true;
					turn++;
				}
				
			}
			
			board.printBoard();
			placed = false;
			System.out.println();
			
			if (board.checkWin(player2)) {
				System.out.println(player2 + " win!!");
				win = true;
				break;
			}
			
			if(turn == board.getSize()*board.getSize()){
				System.out.print("!!!!!!!!Draw!!!!!!!!!");
				break;
			}
		}

	}

}
