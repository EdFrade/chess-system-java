package br.com.chess.application;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.chess.chess.ChessException;
import br.com.chess.chess.ChessMatch;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch(); 
		List<ChessPiece> captured = new ArrayList<>();
		
		
		while(!cm.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMatch(cm, captured);
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = cm.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(cm.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				
				ChessPiece capturedPiece = cm.performChessMove(source, target);
				
				if(capturedPiece != null) {
					captured.add(capturedPiece);
				}
				if (cm.getPromoted() != null) {
					System.out.print("Enter piece for promotion (B/N/R/Q): ");
					String type = sc.nextLine().toUpperCase();
					cm.replacePromotedPiece(type);
				}
			
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InvalidParameterException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(cm, captured);
	}

}
