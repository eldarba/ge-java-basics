package a;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6);
		System.out.println(list);
		int index = list.lastIndexOf(42);
		System.out.println(index);
		System.out.println(list.get(100)); // out of bounds
		
		int[] arr = {2, 4, 6};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]); // out of bounds
		
		 // null pointer
		String str = "aaa";
		System.out.println(str.length());
		str = null;
		System.out.println(str.length());
		
		// arithmetic
		System.out.println(5/0);

	}

}
