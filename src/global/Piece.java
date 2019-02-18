package global;

public abstract class Piece {
	private int[] coord = new int[2];
	private char skin;
	
	public Piece() {
		
	}
	//**********************
	
	
	
	
	
	
	
	
	//*********************
	public int[] getCoord() {
		return coord;
	}

	public void setCoord(int[] coord) {
		this.coord = coord;
	}

	public char getSkin() {
		return skin;
	}

	public void setSkin(char skin) {
		this.skin = skin;
	}
}
