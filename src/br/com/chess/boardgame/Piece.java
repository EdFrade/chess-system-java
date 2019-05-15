package br.com.chess.boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	
	
	public Piece() {
		super();
	}


	public Piece(Board board) {
		this.board = board;
		position = null;
	}


	protected Board getBoard() {
		return board;
	}


	
	
	
	

}
