package br.com.chess.application;

import br.com.chess.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
	
		ChessMatch cm = new ChessMatch(); 
		UI.printBoard(cm.getPieces());
	}

}
