package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;
import global.Piece;

public class Pawn extends ChessPiece implements ChessSkin{

	public Pawn(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BPAWN);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WPAWN);
	}

	public void move() {
		
	}

	public void targetable() {
		
		
	}
	
	
}
