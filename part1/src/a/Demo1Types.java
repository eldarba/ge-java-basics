package a;

public class Demo1Types {

	public static void main(String[] args) {
		
		// primitive data types
		// integers
		byte n1 = 5;
		short n2 = 10;
		int n3 = 100; // int is default for literal integers
		long n4 = 99_999_999_999L;
		
		// decimals
		float f1 = 5.2F;
		double f2 = 5.3; // double is default for literal decimals
		
		System.out.println(0.3333333333333333333333333333D);
		System.out.println(0.3333333333333333333333333333F);
		
		System.out.println(7.3);
		
		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 > 100;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		// characters
		char c1 = 'A'; // 16 bit unicode
		char c2 = 'à';
		char c3 = '\n'; // new line character
		
		System.out.println('à' + " - " + (int)'à');
		// casting
		byte a = 5;
		long b = a; // implicit casting
		byte c = (byte)b; // explicit casting
		
		float d = b; // implicit 64 bit (long) to 32 bit float
		
		b = (long) d; // any cast from decimal to integer is explicit
		
		

	}

}
