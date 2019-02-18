package global;

public class BoardManager {
	private char[][] board;
	private final char[] letters= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public BoardManager(int height, int widht) {
		if(widht>26) {
			widht = 26;
		}
		this.setEmptyBoard(height, widht);
		this.reset();
		
	}
	
	public BoardManager(char[][] board) {
		this(board.length, board[0].length);
		this.setBoard(board);
	}
	
	public void show() {
		String firstLine ="-";
		String lastLine ="-";
		int height = board.length;
		int widht = board[0].length;
		int numberMaxWidht = String.valueOf(height).length();
		
		for(int i = 0 ; i<numberMaxWidht ; i++) {
			firstLine+="-";
			lastLine+="-";
		}		
		for(int i = 0 ; i<widht ; i++) {
			firstLine+=this.letters[i]+"-";
			lastLine+="--";
		}
		System.out.println(firstLine);
		for(int i = 0 ; i<height ; i++) {
			String line = String.valueOf(i+1);
			int numberWidht = line.length();
			for(int j = 0 ; j<numberMaxWidht-numberWidht; j++) {
				line+=" ";
			}
			line+="|";
			for(int j = 0; j<widht ; j++) {
				line+=board[i][j]+"|";
			}
			System.out.println(line);		
		}
		System.out.println(lastLine);
	}
	
	public void reset() {
		for(int i = 0 ; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				this.board[i][j] = ' ';
			}
		}
	}
	
	public void insert(Piece piece) {
		this.board[piece.getLastCoord()[0]][piece.getLastCoord()[1]] = ' ';
		this.board[piece.getCoord()[0]][piece.getCoord()[1]] = piece.getSkin();
	}
	
	
	public void setEmptyBoard(int height, int widht) {
		this.board = new char[height][];
		for(int i=0;i<height;i++) {
			this.board[i] = new char[widht];
		}
	}
	
	public void setBoard(char[][] board) {
		for(int i = 0 ; i<board.length ; i++) {
			if(board[i].length!=this.board[0].length) {
				System.err.println("Matrice invalide !");
				setEmptyBoard(board.length, board[0].length);
				return;
			}
		}	
		this.board = board;
	}
	
	
}
