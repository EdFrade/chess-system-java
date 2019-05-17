package br.com.chess.application;

import java.util.Scanner;

import br.com.chess.chess.ChessMatch;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch(); 
		while(true) {
		UI.printBoard(cm.getPieces());
		System.out.println();
		System.out.println("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		ChessPiece capturedPiece = cm.performChessMove(source, target);
		}
	}

}
