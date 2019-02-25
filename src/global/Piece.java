package global;

public abstract class Piece {

	private char skin;
	private ColorEnum color;
	
	public Piece(char skin,ColorEnum color) {
		this.setSkin(skin);
		this.setColor(color);
	}

	public char getSkin() {
		return skin;
	}

	public void setSkin(char skin) {
		this.skin = skin;
	}
	
	public ColorEnum getColor() {
		return color;
	}
	
	public void setColor(ColorEnum color) {
		this.color = color;
	}


}
