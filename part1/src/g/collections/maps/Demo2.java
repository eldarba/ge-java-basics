package g.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Dog", "a nice animal that barks");
		dictionary.put("Java", "an oop programming language");
		dictionary.put("Haifa", "a city in the north of Israel");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a word: ");
		String input = sc.nextLine();
		if(dictionary.containsKey(input)) {
			System.out.println("definition: " + dictionary.get(input));
		}else {
			System.out.println("entry " + input + " not found");
		}
		sc.close();
		
		
	}

}
