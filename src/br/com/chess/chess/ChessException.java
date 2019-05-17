package br.com.chess.chess;

import br.com.chess.boardgame.BoardException;

public class ChessException extends BoardException{

	private static final long serialVersionUID = 1L;
	
	
	public ChessException(String msg) {
		super(msg);
	}
}
