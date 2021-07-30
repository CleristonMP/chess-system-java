package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	Piece(){
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}

	public boolean possibleMoves() {
		return true;		
	}
	

}
