package a;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Calcualtor c = new Calcualtor();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("enter 2nd number: ");
			int b = sc.nextInt();
			int res = c.div(a, b);
			System.out.println(res);
		} catch (Exception e) {
			// handler code
			System.out.println("error");
			return;
		} finally {
			// do it anyway block
			System.out.println("from finally block");
			sc.close(); // closing a resource
		}
		System.out.println("end of program");
	}
}
