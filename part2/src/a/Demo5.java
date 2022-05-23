package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		File file = new File("c:/eldar/aaaaa");
		System.out.println(file);
		
		// checked exception
		try(Scanner sc = new Scanner(file);){ 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
