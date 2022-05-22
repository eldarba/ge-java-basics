package a;

public class Demo5 {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		print(x);
		System.out.println(x);
	}
	
	// call by value always
	public static void print(int x) {
		x = x + 5;
		System.out.println(x);
	} 

}
