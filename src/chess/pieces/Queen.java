package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;

public class Queen extends ChessPiece implements ChessSkin{

	public Queen(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BQUEEN);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WQUEEN);
	}

	public void move() {
		
	}

	public void targetable() {
		
	}

}
