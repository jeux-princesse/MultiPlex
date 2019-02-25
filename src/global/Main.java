package global;

import chess.ChessUtils;

public class Main {

	public static void main(String[] args) {
		BoardManager bm = new BoardManager(ChessUtils.genBoard());
		bm.show();

	}

}
