package a;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		// try with resource (ARM) will automatically close a resource
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("enter 2nd number: ");
			int b = sc.nextInt();
			System.out.println(a + ", " + b);
		}
	}

}
