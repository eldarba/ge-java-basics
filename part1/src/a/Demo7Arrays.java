package a;

import java.util.Arrays;

public class Demo7Arrays {
	
	public static void main(String[] args) {
		char[] arr = {'A', 'B', 'C'};
		System.out.println("array length: " + arr.length);
		System.out.println(Arrays.toString(arr));
		
		char[] arrTemp = new char[arr.length + 2];
		System.arraycopy(arr, 0, arrTemp, 0, arr.length);
		arr = arrTemp;
		System.out.println(Arrays.toString(arr));
	}

}
