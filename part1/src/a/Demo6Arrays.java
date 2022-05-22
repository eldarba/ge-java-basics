package a;

import java.util.Arrays;

public class Demo6Arrays {

	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));

		System.out.println(arr[2]);

	}

}
