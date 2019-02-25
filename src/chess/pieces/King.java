package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;

public class King extends ChessPiece implements ChessSkin{

	public King(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BKING);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WKING);
	}

	public void move() {
		
	}

	public void targetable() {
		
	}

}
