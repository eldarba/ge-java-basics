package g.collections;

public class PointTest {

	public static void main(String[] args) {

		Point p1 = new Point(5, 5);
		Point p2 = new Point(5, 5);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
