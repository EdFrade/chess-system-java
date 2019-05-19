package br.com.chess.chess.pieces;

import br.com.chess.boardgame.Board;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
	

}
