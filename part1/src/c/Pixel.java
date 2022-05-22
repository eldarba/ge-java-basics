package c;

public class Pixel extends Point {
	
	private String color;
	
	public Pixel() {
		super();
	}

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
