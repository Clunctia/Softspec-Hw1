
public class Board {
	static int size;
	static String[][] board;
	public Board(){
		size = 9;
		board = new String[size][size];
		for(int i=0 ; i<size ; i++){
			for(int j=0 ;j<size ; j++){
				board[i][j] = "_";
			}
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public String[][] getBoard(){
		return board;
	}
	
	public void placeSymBol(Symbol s, int row, int col){
		for(int i=0 ; i<size ; i++){
			for(int j=0 ; j<size ; j++){
				if(i == row-1 && j == col-1){
					board[i][j] = s.value;
				}
			}
		}
		
	}
	
	public void printBoard(){
		for(int i=0 ; i<=size ; i++){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0 ; i < size ; i++){
			System.out.print((i+1)+" ");
			for(int j=0 ; j < size ; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();		
		}
		System.out.println();
	}
	
	public boolean checkWin(Player player, Board board){
		boolean win = false;
		if(checkRow(board, player)){
			return win = true;
		}else if(checkColumn(board, player)){
			return win = true;
		}else if(checkCross(board, player)){
			return win = true;
		}
		return win;
	}
	
	public boolean checkCross(Board board, Player player){
		boolean checked = false;
		for(int i=0 ; i<board.getSize() ; i++){
			for(int j=0 ; j<board.getSize() ; j++){
				
			}
		}
		
		
		return checked;
	}
	
	public boolean checkRow(Board board, Player player){
		boolean checked = false;
		int count = 0;
		for(int i=0 ; i<board.getSize() ; i++){
			for(int j=0 ; j<board.getSize() ; j++){
				if(board.getBoard()[i][j].equals(player.getSymValue())){
					count++;
					if(count == board.getSize()){
						return true;
					}
				}else{
					count = 0;
				}
			}
		}
		
		return checked;
	}
	
	public boolean checkColumn(Board board, Player player){
		boolean checked = false;
		int count = 0;
		for(int i=0 ; i<board.getSize() ; i++){
			for(int j=0 ; j<board.getSize() ; j++){
				if(board.getBoard()[j][i].equals(player.getSymValue())){
					count++;
					if(count == board.getSize()){
						return true;
					}
				}else{
					count = 0;
				}
			}
		}
		
		return checked;
	}
	
	
}
