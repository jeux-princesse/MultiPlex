package global;

import java.util.Arrays;

public class BoardManager <T>{
	private T[][] board;
	
	@SuppressWarnings("unchecked")
	public BoardManager(int height, int widht) {
		
		this.board = (T[][])new Object[height][];
		for(int i=0;i<height;i++) {
			this.board[i] = (T[])new Object[widht];
		}
		
	}
	
	public void show() {
		for(int i = 0 ; i<board.length; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
	}
	
	public T[][] getBoard(){
		return board;
	}
	
	public void insert(int line, int column, T things) {
		this.board[line][column] = things;
	}
}
