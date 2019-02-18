package chess;

import global.BoardManager;
import global.Piece;

public class chessManager {
	private BoardManager bord;
	private Piece[] white;
	private Piece[] black;
	private int pointB = 0;
	private int pointW = 0;
	
	public chessManager(){
		char[][] tmp = {{'T','C','F','D','R','F','C','T'},
						{'P','P','P','P','P','P','P','P'},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{'P','P','P','P','P','P','P','P'},
						{'T','C','F','D','R','F','C','T'}};
		
		this.bord = new BoardManager(tmp);
		
	}
	
}
