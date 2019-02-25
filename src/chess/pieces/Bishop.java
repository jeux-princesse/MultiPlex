package chess.pieces;

import chess.ChessSkin;
import global.ColorEnum;

public class Bishop extends ChessPiece implements ChessSkin{

	public Bishop(ColorEnum color) {
		super('\u0000', color);
		if(color.equals(ColorEnum.BLACK)) this.setSkin(BBISHOP);
		else if (color.equals(ColorEnum.WHITE)) this.setSkin(WBISHOP);
	}

	public void move() {		
	}

	public void targetable() {	
	}

}
