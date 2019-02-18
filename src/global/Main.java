package global;

public class Main {

	public static void main(String[] args) {
		char[][] board = {{'a','b','c'},
						{'d','f'}};
		BoardManager bm = new BoardManager(board);
		bm.show();

	}

}
