package c;

import lombok.Data;

@Data
public class Point {
	
	private int x;
	private int y;
	
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p);
	}
	
	

}
