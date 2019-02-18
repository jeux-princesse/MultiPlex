package global;

public abstract class Piece {
	private int[] coord = new int[2];
	private char skin;
	private boolean color;
	
	public Piece(int[] coord,char skin,boolean color) {
		this.coord = coord;
		this.skin = skin;
		this.color = color;
	}
	//**********************
	
	public abstract void move() ;
	public abstract void targetable();
	
	
	
	
	
	
	
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
	
	public boolean getColor() {
		return color;
	}
	
	public void setColor(boolean color) {
		this.color = color;
	}
}
