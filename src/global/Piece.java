package global;

public abstract class Piece {
	private int[] coord = {0,0};
	private char skin;
	private boolean color;
	private int[] lastCoord;
	
	public Piece(int[] coord,char skin,boolean color) {
		this.setCoord(coord);
		this.setLastCoord(coord);
		this.setSkin(skin);
		this.setColor(color);
	}
	//**********************
	
	public abstract void move() ;
	public abstract void targetable();
	
	
	
	
	
	
	
	//*********************
	public int[] getCoord() {
		return coord;
	}

	public void setCoord(int[] coord) {
		this.setLastCoord(this.coord);
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
	public int[] getLastCoord() {
		return lastCoord;
	}

	public void setLastCoord(int[] coord) {
		this.lastCoord = coord;
	}
}
