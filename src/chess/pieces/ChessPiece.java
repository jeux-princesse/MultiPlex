package chess.pieces;

import global.ColorEnum;
import global.Piece;

public abstract class ChessPiece extends Piece{
	
	public ChessPiece(char skin, ColorEnum color) {
		super(skin, color);
	}

	public abstract void move();
	public abstract void targetable();
}
