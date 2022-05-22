package a;

public class Demo3WhileLoop {

	public static void main(String[] args) {
		
		int x = (int) (Math.random() * 101);
		System.out.println(x);
		
		int c = 0;
		
		while(c <= x) {
			System.out.println(c);
			c++;
		}

	}

}
