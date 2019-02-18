package global;

public abstract class Piece {
	private int[] coord = new int[2];
	private String skin;
	
	public Piece() {
		
	}

	
	
	
	
	
	
	
	
	
	public int[] getCoord() {
		return coord;
	}

	public void setCoord(int[] coord) {
		this.coord = coord;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
}
