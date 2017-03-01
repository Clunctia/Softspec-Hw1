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
		boolean winner = false;
		scan = new Scanner(System.in);
		Board board = new Board();
		System.out.print("Please enter player1 name: ");
		String name = scan.nextLine();
		player1 = new Player(name, "X");
		System.out.print("Please enter player2 name: ");
		name = scan.nextLine();
		player2 = new Player(name, "O");


		
		System.out.println(player1.toString() + "'s turn.");
		System.out.print("Please select row: ");
		row = Integer.parseInt(scan.nextLine());
		System.out.print("Please select col: ");
		col = Integer.parseInt(scan.nextLine());
		player1.placeSymbol(board, row, col);
		board.printBoard();
		
		if(board.checkWin(player1, board)){
			System.out.println(player1 + " win!!");
			winner = true;
		}
		


		System.out.println(player2.toString() + "'s turn.");
		System.out.print("Please select row: ");
		row = Integer.parseInt(scan.nextLine());
		System.out.print("Please select col: ");
		col = Integer.parseInt(scan.nextLine());
		player2.placeSymbol(board, row, col);
		board.printBoard();
		
		if(board.checkWin(player2, board)){
			System.out.println(player2 + " win!!");
			winner = true;
		}
		

	}
	
	
}
