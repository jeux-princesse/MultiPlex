package chess;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;
import global.BoardManager;
import global.ColorEnum;
import global.Piece;

public class ChessUtils {
	
	public static Bishop genBishop(ColorEnum color) {
		return new Bishop(color);
	}
	
	public static Rook genRook(ColorEnum color) {
		return new Rook(color);
	}
	
	public static Knight genKnight(ColorEnum color) {
		return new Knight(color);
	}
	
	public static Queen genQueen(ColorEnum color) {
		return new Queen(color);
	}
	
	public static King genKing(ColorEnum color) {
		return new King(color);
	}
	
	public static Pawn genPawn(ColorEnum color) {
		return new Pawn(color);
	}
	
	
	public static Piece[][] genBoard() {
		BoardManager bm = new BoardManager(8, 8);
		bm.insert(genRook(ColorEnum.BLACK), 0, 0);
		bm.insert(genKnight(ColorEnum.BLACK), 0, 1);
		bm.insert(genBishop(ColorEnum.BLACK), 0, 2);
		bm.insert(genQueen(ColorEnum.BLACK), 0, 3);
		bm.insert(genKing(ColorEnum.BLACK), 0, 4);
		bm.insert(genBishop(ColorEnum.BLACK), 0, 5);
		bm.insert(genKnight(ColorEnum.BLACK), 0, 6);
		bm.insert(genRook(ColorEnum.BLACK), 0, 7);
		for(int i = 0 ; i<8 ; i++) {
			bm.insert(genPawn(ColorEnum.BLACK), 1, i);
		}
		for(int i = 0 ; i<8 ; i++) {
			bm.insert(genPawn(ColorEnum.WHITE), 6, i);
		}
		bm.insert(genRook(ColorEnum.WHITE), 7, 0);
		bm.insert(genKnight(ColorEnum.WHITE), 7, 1);
		bm.insert(genBishop(ColorEnum.WHITE), 7, 2);
		bm.insert(genQueen(ColorEnum.WHITE), 7, 3);
		bm.insert(genKing(ColorEnum.WHITE), 7, 4);
		bm.insert(genBishop(ColorEnum.WHITE), 7, 5);
		bm.insert(genKnight(ColorEnum.WHITE), 7, 6);
		bm.insert(genRook(ColorEnum.WHITE), 7, 7);
		return bm.getBoard();
	}
}
