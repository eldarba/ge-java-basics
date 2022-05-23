package a;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Calcualtor c = new Calcualtor();
		
		
		
		// try with resource (ARM) will automatically close a resource
		try (Scanner sc = new Scanner(System.in); MyClosable mc = new MyClosable();) {
			System.out.print("enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("enter 2nd number: ");
			int b = sc.nextInt();
			int res = c.div(a, b);
			System.out.println(res);
		} catch (Exception e) {
			// handler code
			System.out.println("error");
		}finally {
			System.out.println("finally");
		}
		System.out.println("end of program");
	}
}

class MyClosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("=== closing ===");
		
	}

}
