package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;

public class Rook extends ChessPiece implements ChessSkin{
	
	public Rook(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BROOK);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WROOK);
	}

	public void move() {
	}

	public void targetable() {
	}

}
