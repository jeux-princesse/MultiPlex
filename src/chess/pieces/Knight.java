package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;

public class Knight extends ChessPiece implements ChessSkin{

	public Knight(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BKNIGHT);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WKNIGHT);
	}

	public void move() {
		
	}

	public void targetable() {
		
	}

}
