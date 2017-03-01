
public class Player {
	private String name, symValue;
	public void placeSymbol(Board b, int row, int col){
		b.placeSymBol(new Symbol(symValue), row, col);
	}
	
	public Player(String name, String symValue){
		super();
		this.name = name;
		this.symValue = symValue;
		
	}
	
	public String getSymValue(){
		return symValue;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
}
