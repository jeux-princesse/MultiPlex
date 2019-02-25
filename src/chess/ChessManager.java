package chess;

import global.BoardManager;
import global.Piece;

public class ChessManager {
	private BoardManager bord;
	private int pointB = 0;
	private int pointW = 0;
	
	public ChessManager(){
		this.bord = new BoardManager(ChessUtils.genBoard());
	}
	
}
